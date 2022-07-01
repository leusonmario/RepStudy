import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest25 {

    public static boolean debug = false;

    @Test
    public void test12501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12501");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test12502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12502");
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
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test12503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12503");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test12504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12504");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray22 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass23 = appConfigurationEntryArray22.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test12505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12505");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test12506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12506");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test12507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12507");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12508");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test12509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12509");
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
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
    }

    @Test
    public void test12510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12510");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test12511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12511");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test12512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12512");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test12513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12513");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12514");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test12515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12515");
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
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test12516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12516");
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
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test12517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12517");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test12518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12518");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test12519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12519");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test12520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12520");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass18 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test12521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12521");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test12522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12522");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test12523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12523");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test12524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12524");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass21 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test12525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12525");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12526");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test12527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12527");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test12528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12528");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12529");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test12530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12530");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test12531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12531");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test12532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12532");
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
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray24 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider25 = kerberosUserConfiguration1.getProvider();
        java.lang.String str26 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass27 = kerberosUserConfiguration1.getClass();
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
        org.junit.Assert.assertNotNull(appConfigurationEntryArray24);
        org.junit.Assert.assertNull(provider25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test12533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12533");
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
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12534");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test12535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12535");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12536");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test12537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12537");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test12538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12538");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12539");
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
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = parameters17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test12540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12540");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test12541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12541");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test12542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12542");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test12543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12543");
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
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12544");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test12545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12545");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test12546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12546");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12547");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12548");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test12549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12549");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12550");
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
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test12551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12551");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test12552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12552");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test12553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12553");
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
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider22 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = provider22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
        org.junit.Assert.assertNull(provider22);
    }

    @Test
    public void test12554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12554");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test12555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12555");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test12556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12556");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test12557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12557");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test12558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12558");
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
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test12559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12559");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12560");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test12561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12561");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12562");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test12563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12563");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray22 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider23 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray22);
        org.junit.Assert.assertNull(provider23);
    }

    @Test
    public void test12564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12564");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test12565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12565");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test12566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12566");
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
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray23 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass24 = appConfigurationEntryArray23.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(parameters19);
        org.junit.Assert.assertNull(parameters20);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test12567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12567");
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
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider19 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(provider19);
    }

    @Test
    public void test12568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12568");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test12569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12569");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider21 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray24 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray26 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters27 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters28 = kerberosUserConfiguration1.getParameters();
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
        org.junit.Assert.assertNull(provider21);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray24);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray26);
        org.junit.Assert.assertNull(parameters27);
        org.junit.Assert.assertNull(parameters28);
    }

    @Test
    public void test12570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12570");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test12571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12571");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test12572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12572");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12573");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test12574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12574");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test12575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12575");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test12576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12576");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test12577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12577");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12578");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test12579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12579");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass13 = appConfigurationEntryArray12.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test12580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12580");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test12581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12581");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = provider10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test12582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12582");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test12583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12583");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test12584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12584");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test12585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12585");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test12586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12586");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test12587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12587");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test12588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12588");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test12589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12589");
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
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        java.lang.String str19 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test12590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12590");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12591");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12592");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test12593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12593");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test12594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12594");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass18 = appConfigurationEntryArray17.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test12595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12595");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test12596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12596");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(parameters18);
    }

    @Test
    public void test12597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12597");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test12598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12598");
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
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test12599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12599");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test12600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12600");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test12601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12601");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test12602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12602");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test12603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12603");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test12604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12604");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test12605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12605");
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
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test12606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12606");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test12607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12607");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test12608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12608");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test12609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12609");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test12610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12610");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        configuration0.refresh();
        java.security.Provider provider4 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test12611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12611");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test12612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12612");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test12613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12613");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test12614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12614");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test12615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12615");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test12616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12616");
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
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(parameters18);
    }

    @Test
    public void test12617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12617");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test12618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12618");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12619");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        java.security.Provider provider5 = configuration0.getProvider();
        java.security.Provider provider6 = configuration0.getProvider();
        java.security.Provider provider7 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        configuration0.refresh();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters14 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test12620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12620");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test12621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12621");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test12622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12622");
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
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test12623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12623");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12624");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test12625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12625");
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
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test12626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12626");
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
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(parameters20);
    }

    @Test
    public void test12627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12627");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test12628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12628");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test12629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12629");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test12630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12630");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test12631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12631");
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
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test12632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12632");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
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
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test12633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12633");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test12634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12634");
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
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test12635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12635");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test12636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12636");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = provider17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test12637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12637");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray22 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray22);
    }

    @Test
    public void test12638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12638");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
    }

    @Test
    public void test12639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12639");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test12640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12640");
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
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test12641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12641");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test12642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12642");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test12643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12643");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12644");
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
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass21 = appConfigurationEntryArray20.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test12645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12645");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(parameters18);
    }

    @Test
    public void test12646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12646");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test12647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12647");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(parameters18);
    }

    @Test
    public void test12648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12648");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test12649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12649");
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
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test12650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12650");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test12651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12651");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12652");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str4 = configuration0.getType();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        java.security.Provider provider7 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test12653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12653");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12654");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.String str19 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test12655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12655");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test12656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12656");
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
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider22 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
        org.junit.Assert.assertNull(provider22);
    }

    @Test
    public void test12657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12657");
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
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12658");
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
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass20 = appConfigurationEntryArray19.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test12659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12659");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test12660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12660");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test12661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12661");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test12662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12662");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test12663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12663");
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
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test12664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12664");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test12665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12665");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test12666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12666");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test12667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12667");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        java.security.Provider provider2 = configuration0.getProvider();
        java.lang.String str3 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test12668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12668");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass18 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test12669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12669");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
    }

    @Test
    public void test12670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12670");
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
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
    }

    @Test
    public void test12671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12671");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray23 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray26 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray29 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray31 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray33 = kerberosUserConfiguration1.getAppConfigurationEntry("");
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
        org.junit.Assert.assertNotNull(appConfigurationEntryArray23);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray26);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray29);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray31);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray33);
    }

    @Test
    public void test12672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12672");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider20 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray22 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str23 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test12673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12673");
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
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test12674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12674");
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
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test12675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12675");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test12676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12676");
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
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters22 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
        org.junit.Assert.assertNull(parameters22);
    }

    @Test
    public void test12677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12677");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test12678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12678");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
    }

    @Test
    public void test12679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12679");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test12680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12680");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test12681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12681");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test12682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12682");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test12683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12683");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test12684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12684");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = provider10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test12685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12685");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test12686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12686");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = provider12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test12687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12687");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test12688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12688");
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
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider19 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(provider19);
    }

    @Test
    public void test12689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12689");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test12690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12690");
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
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test12691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12691");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test12692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12692");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = provider17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test12693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12693");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test12694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12694");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test12695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12695");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test12696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12696");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test12697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12697");
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
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test12698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12698");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12699");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12700");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12701");
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
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test12702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12702");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        configuration0.refresh();
        java.security.Provider provider4 = configuration0.getProvider();
        java.security.Provider provider5 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        java.lang.String str8 = configuration0.getType();
        java.lang.Class<?> wildcardClass9 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test12703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12703");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test12704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12704");
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
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12705");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test12706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12706");
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
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test12707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12707");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test12708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12708");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12709");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test12710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12710");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test12711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12711");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test12712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12712");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test12713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12713");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test12714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12714");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test12715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12715");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test12716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12716");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test12717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12717");
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
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12718");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12719");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test12720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12720");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(parameters19);
        org.junit.Assert.assertNull(parameters20);
    }

    @Test
    public void test12721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12721");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test12722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12722");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test12723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12723");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = provider12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test12724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12724");
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
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test12725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12725");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider20 = kerberosUserConfiguration1.getProvider();
        java.lang.String str21 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters22 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters23 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(parameters22);
        org.junit.Assert.assertNull(parameters23);
    }

    @Test
    public void test12726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12726");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test12727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12727");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test12728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12728");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test12729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12729");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test12730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12730");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test12731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12731");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test12732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12732");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test12733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12733");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12734");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test12735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12735");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test12736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12736");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(parameters18);
    }

    @Test
    public void test12737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12737");
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
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str20 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test12738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12738");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12739");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test12740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12740");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test12741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12741");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12742");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test12743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12743");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12744");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test12745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12745");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test12746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12746");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider20 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters21 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider22 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(parameters21);
        org.junit.Assert.assertNull(provider22);
    }

    @Test
    public void test12747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12747");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test12748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12748");
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
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str19 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass20 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test12749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12749");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test12750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12750");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test12751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12751");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        java.lang.String str19 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test12752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12752");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12753");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str4 = configuration0.getType();
        java.lang.String str5 = configuration0.getType();
        java.lang.String str6 = configuration0.getType();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        java.security.Provider provider9 = configuration0.getProvider();
        java.lang.String str10 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12754");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test12755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12755");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test12756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12756");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test12757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12757");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test12758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12758");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test12759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12759");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test12760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12760");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters21 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(parameters21);
    }

    @Test
    public void test12761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12761");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test12762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12762");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test12763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12763");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test12764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12764");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass15 = appConfigurationEntryArray14.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test12765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12765");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test12766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12766");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12767");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test12768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12768");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12769");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test12770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12770");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test12771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12771");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test12772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12772");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test12773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12773");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test12774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12774");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test12775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12775");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12776");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12777");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test12778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12778");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider19 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(provider19);
    }

    @Test
    public void test12779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12779");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass16 = appConfigurationEntryArray15.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test12780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12780");
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
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider19 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray22 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters24 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray22);
        org.junit.Assert.assertNull(parameters24);
    }

    @Test
    public void test12781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12781");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test12782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12782");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12783");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass15 = appConfigurationEntryArray14.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test12784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12784");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("");
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
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
    }

    @Test
    public void test12785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12785");
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
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12786");
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
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test12787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12787");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
    }

    @Test
    public void test12788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12788");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass19 = appConfigurationEntryArray18.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test12789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12789");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test12790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12790");
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
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test12791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12791");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test12792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12792");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test12793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12793");
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
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test12794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12794");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test12795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12795");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test12796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12796");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test12797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12797");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test12798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12798");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test12799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12799");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test12800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12800");
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
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test12801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12801");
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
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        java.lang.String str19 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray21 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray21);
    }

    @Test
    public void test12802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12802");
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
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str20 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters21 = kerberosUserConfiguration1.getParameters();
        java.lang.String str22 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters23 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(parameters21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(parameters23);
    }

    @Test
    public void test12803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12803");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test12804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12804");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test12805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12805");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test12806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12806");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12807");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test12808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12808");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test12809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12809");
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
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass21 = appConfigurationEntryArray20.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test12810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12810");
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
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test12811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12811");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test12812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12812");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12813");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test12814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12814");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass16 = appConfigurationEntryArray15.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test12815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12815");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
    }

    @Test
    public void test12816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12816");
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
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12817");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test12818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12818");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test12819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12819");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test12820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12820");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test12821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12821");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass20 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test12822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12822");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test12823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12823");
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
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test12824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12824");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test12825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12825");
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
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass18 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test12826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12826");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12827");
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
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test12828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12828");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test12829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12829");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test12830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12830");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test12831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12831");
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
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test12832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12832");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider22 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider23 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters24 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters25 = kerberosUserConfiguration1.getParameters();
        java.lang.String str26 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass27 = kerberosUserConfiguration1.getClass();
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
        org.junit.Assert.assertNull(provider22);
        org.junit.Assert.assertNull(provider23);
        org.junit.Assert.assertNull(parameters24);
        org.junit.Assert.assertNull(parameters25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test12833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12833");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider19 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider19);
    }

    @Test
    public void test12834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12834");
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
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test12835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12835");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test12836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12836");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12837");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test12838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12838");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test12839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12839");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray21 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass22 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test12840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12840");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test12841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12841");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test12842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12842");
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
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12843");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        java.security.Provider provider2 = configuration0.getProvider();
        configuration0.refresh();
        java.lang.String str4 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        java.lang.String str8 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        java.lang.String str10 = configuration0.getType();
        java.security.Provider provider11 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test12844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12844");
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
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test12845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12845");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test12846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12846");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test12847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12847");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test12848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12848");
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
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test12849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12849");
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
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider21 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
        org.junit.Assert.assertNull(provider21);
    }

    @Test
    public void test12850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12850");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test12851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12851");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray23 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray26 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray28 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters29 = kerberosUserConfiguration1.getParameters();
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
        org.junit.Assert.assertNotNull(appConfigurationEntryArray23);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray26);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray28);
        org.junit.Assert.assertNull(parameters29);
    }

    @Test
    public void test12852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12852");
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
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
    }

    @Test
    public void test12853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12853");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test12854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12854");
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
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test12855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12855");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test12856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12856");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test12857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12857");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test12858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12858");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass19 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test12859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12859");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test12860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12860");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12861");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test12862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12862");
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
        kerberosUserConfiguration1.refresh();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test12863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12863");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        java.security.Provider provider5 = configuration0.getProvider();
        java.security.Provider provider6 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider9 = configuration0.getProvider();
        java.lang.String str10 = configuration0.getType();
        java.lang.String str11 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12864");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test12865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12865");
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
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test12866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12866");
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
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test12867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12867");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test12868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12868");
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
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test12869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12869");
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
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test12870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12870");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test12871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12871");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test12872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12872");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str19 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test12873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12873");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test12874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12874");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        java.lang.String str19 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(parameters20);
    }

    @Test
    public void test12875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12875");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test12876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12876");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test12877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12877");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test12878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12878");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12879");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test12880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12880");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test12881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12881");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test12882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12882");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test12883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12883");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test12884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12884");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass20 = appConfigurationEntryArray19.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test12885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12885");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        configuration0.refresh();
        java.lang.String str3 = configuration0.getType();
        java.security.Provider provider4 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        java.lang.String str6 = configuration0.getType();
        java.security.Provider provider7 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider9 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test12886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12886");
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
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
    }

    @Test
    public void test12887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12887");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test12888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12888");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12889");
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
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test12890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12890");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test12891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12891");
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
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test12892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12892");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test12893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12893");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass14 = appConfigurationEntryArray13.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test12894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12894");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12895");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12896");
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
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
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
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test12897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12897");
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
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test12898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12898");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass19 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test12899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12899");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test12900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12900");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test12901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12901");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test12902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12902");
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
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test12903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12903");
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
        java.lang.String str19 = kerberosUserConfiguration1.getType();
        java.security.Provider provider20 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider21 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
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
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(provider21);
    }

    @Test
    public void test12904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12904");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        java.lang.String str20 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(parameters19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test12905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12905");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str19 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray21 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray21);
    }

    @Test
    public void test12906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12906");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test12907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12907");
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
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
    }

    @Test
    public void test12908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12908");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test12909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12909");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test12910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12910");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test12911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12911");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test12912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12912");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12913");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12914");
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
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12915");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test12916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12916");
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
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test12917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12917");
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
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test12918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12918");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12919");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test12920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12920");
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
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str21 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray24 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray26 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray24);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray26);
    }

    @Test
    public void test12921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12921");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test12922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12922");
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
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12923");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test12924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12924");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12925");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12926");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test12927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12927");
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
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray21 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray21);
    }

    @Test
    public void test12928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12928");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test12929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12929");
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
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12930");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test12931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12931");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test12932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12932");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test12933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12933");
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
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray21 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
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
        org.junit.Assert.assertNotNull(appConfigurationEntryArray21);
    }

    @Test
    public void test12934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12934");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test12935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12935");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test12936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12936");
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
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test12937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12937");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        java.lang.String str19 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test12938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12938");
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
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test12939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12939");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test12940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12940");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test12941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12941");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test12942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12942");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test12943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12943");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test12944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12944");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(parameters18);
    }

    @Test
    public void test12945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12945");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test12946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12946");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str20 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test12947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12947");
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
        java.lang.String str19 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(parameters20);
    }

    @Test
    public void test12948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12948");
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
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test12949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12949");
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
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test12950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12950");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test12951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12951");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test12952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12952");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test12953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12953");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test12954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12954");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test12955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12955");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test12956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12956");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test12957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12957");
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
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test12958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12958");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test12959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12959");
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
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12960");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test12961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12961");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test12962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12962");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test12963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12963");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test12964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12964");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test12965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12965");
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
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str21 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test12966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12966");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test12967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12967");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12968");
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
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test12969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12969");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
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
    public void test12970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12970");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12971");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test12972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12972");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray23 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray25 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray27 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray29 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass30 = appConfigurationEntryArray29.getClass();
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
        org.junit.Assert.assertNotNull(appConfigurationEntryArray23);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray25);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray27);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test12973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12973");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test12974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12974");
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
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test12975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12975");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test12976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12976");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test12977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12977");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test12978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12978");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test12979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12979");
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
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray21 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str22 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(parameters19);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test12980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12980");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12981");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test12982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12982");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration1.getParameters();
        java.lang.String str21 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(parameters20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test12983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12983");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test12984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12984");
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
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = parameters15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test12985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12985");
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
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12986");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test12987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12987");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test12988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12988");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray21 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(parameters19);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray21);
    }

    @Test
    public void test12989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12989");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test12990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12990");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test12991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12991");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12992");
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
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test12993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12993");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test12994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12994");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12995");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test12996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12996");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass18 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test12997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12997");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test12998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12998");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12999");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test13000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test13000");
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
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }
}

