import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test05501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05501");
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
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
    }

    @Test
    public void test05502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05502");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test05503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05503");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test05504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05504");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test05505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05505");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test05506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05506");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test05507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05507");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test05508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05508");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass16 = appConfigurationEntryArray15.getClass();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test05509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05509");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test05510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05510");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test05511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05511");
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
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test05512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05512");
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
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass18 = kerberosUserConfiguration1.getClass();
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
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test05513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05513");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test05514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05514");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test05515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05515");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test05516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05516");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
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
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test05517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05517");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test05518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05518");
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
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
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
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test05519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05519");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test05520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05520");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test05521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05521");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test05522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05522");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test05523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05523");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test05524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05524");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test05525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05525");
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
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass20 = kerberosUserConfiguration1.getClass();
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
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test05526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05526");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test05527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05527");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test05528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05528");
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
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass20 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test05529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05529");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
    }

    @Test
    public void test05530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05530");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test05531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05531");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test05532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05532");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test05533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05533");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test05534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05534");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = parameters17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test05535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05535");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
    }

    @Test
    public void test05536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05536");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass17 = appConfigurationEntryArray16.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test05537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05537");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test05538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05538");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test05539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05539");
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
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str20 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test05540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05540");
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
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass19 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test05541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05541");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test05542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05542");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test05543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05543");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = parameters8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test05544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05544");
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
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test05545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05545");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        java.lang.Class<?> wildcardClass18 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test05546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05546");
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
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = parameters13.getClass();
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
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test05547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05547");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test05548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05548");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test05549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05549");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass13 = appConfigurationEntryArray12.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test05550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05550");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test05551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05551");
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
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test05552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05552");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test05553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05553");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test05554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05554");
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
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test05555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05555");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
    }

    @Test
    public void test05556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05556");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test05557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05557");
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
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        java.lang.String str19 = kerberosUserConfiguration1.getType();
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
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test05558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05558");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(parameters18);
    }

    @Test
    public void test05559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05559");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test05560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05560");
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
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider19 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str21 = kerberosUserConfiguration1.getType();
        java.lang.String str22 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters23 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray25 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
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
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(parameters23);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray25);
    }

    @Test
    public void test05561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05561");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test05562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05562");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test05563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05563");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test05564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05564");
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
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test05565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05565");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test05566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05566");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test05567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05567");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test05568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05568");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = parameters13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test05569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05569");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test05570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05570");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test05571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05571");
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
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider20 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters21 = kerberosUserConfiguration1.getParameters();
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(parameters21);
    }

    @Test
    public void test05572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05572");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str2 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test05573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05573");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test05574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05574");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test05575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05575");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test05576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05576");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test05577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05577");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
    }

    @Test
    public void test05578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05578");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test05579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05579");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test05580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05580");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test05581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05581");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test05582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05582");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test05583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05583");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test05584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05584");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test05585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05585");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test05586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05586");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test05587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05587");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = parameters13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test05588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05588");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test05589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05589");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
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
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test05590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05590");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test05591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05591");
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
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test05592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05592");
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
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test05593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05593");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test05594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05594");
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
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray21 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray21);
    }

    @Test
    public void test05595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05595");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test05596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05596");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test05597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05597");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test05598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05598");
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
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass19 = appConfigurationEntryArray18.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test05599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05599");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters3);
    }

    @Test
    public void test05600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05600");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test05601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05601");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test05602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05602");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test05603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05603");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        configuration0.refresh();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.Class<?> wildcardClass5 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test05604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05604");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test05605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05605");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str21 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test05606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05606");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test05607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05607");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass18 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test05608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05608");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test05609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05609");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test05610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05610");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test05611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05611");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test05612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05612");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test05613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05613");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = provider14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test05614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05614");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
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
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test05615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05615");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test05616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05616");
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
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test05617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05617");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test05618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05618");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test05619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05619");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test05620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05620");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test05621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05621");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test05622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05622");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test05623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05623");
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
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray21 = kerberosUserConfiguration1.getAppConfigurationEntry("");
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
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray21);
    }

    @Test
    public void test05624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05624");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test05625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05625");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test05626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05626");
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
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test05627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05627");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test05628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05628");
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
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(parameters20);
    }

    @Test
    public void test05629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05629");
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
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass19 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test05630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05630");
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
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test05631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05631");
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
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str19 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test05632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05632");
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
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
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
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test05633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05633");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test05634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05634");
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
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test05635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05635");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test05636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05636");
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
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider19 = kerberosUserConfiguration1.getProvider();
        java.lang.String str20 = kerberosUserConfiguration1.getType();
        java.security.Provider provider21 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str23 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray26 = kerberosUserConfiguration1.getAppConfigurationEntry("");
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
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(provider21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray26);
    }

    @Test
    public void test05637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05637");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test05638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05638");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str22 = kerberosUserConfiguration1.getType();
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
        org.junit.Assert.assertNull(parameters20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test05639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05639");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test05640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05640");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test05641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05641");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test05642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05642");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test05643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05643");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test05644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05644");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test05645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05645");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test05646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05646");
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
        kerberosUserConfiguration1.refresh();
        java.lang.String str21 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray23 = kerberosUserConfiguration1.getAppConfigurationEntry("");
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
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray23);
    }

    @Test
    public void test05647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05647");
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
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test05648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05648");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test05649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05649");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass15 = appConfigurationEntryArray14.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test05650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05650");
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
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test05651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05651");
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
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass20 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test05652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05652");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test05653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05653");
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
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test05654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05654");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test05655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05655");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test05656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05656");
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
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        java.security.Provider provider19 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(provider19);
    }

    @Test
    public void test05657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05657");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test05658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05658");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test05659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05659");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test05660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05660");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test05661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05661");
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
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test05662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05662");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test05663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05663");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test05664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05664");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test05665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05665");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test05666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05666");
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
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test05667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05667");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test05668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05668");
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
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider19 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray22 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str23 = kerberosUserConfiguration1.getType();
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
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(parameters20);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test05669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05669");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test05670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05670");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test05671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05671");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test05672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05672");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass20 = appConfigurationEntryArray19.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test05673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05673");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test05674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05674");
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
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters21 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
        org.junit.Assert.assertNull(parameters21);
    }

    @Test
    public void test05675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05675");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test05676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05676");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test05677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05677");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        java.lang.String str19 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray21 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters22 = kerberosUserConfiguration1.getParameters();
        java.lang.String str23 = kerberosUserConfiguration1.getType();
        java.security.Provider provider24 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray21);
        org.junit.Assert.assertNull(parameters22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(provider24);
    }

    @Test
    public void test05678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05678");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass16 = appConfigurationEntryArray15.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test05679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05679");
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
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
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
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(provider19);
    }

    @Test
    public void test05680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05680");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass14 = appConfigurationEntryArray13.getClass();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test05681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05681");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test05682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05682");
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
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test05683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05683");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test05684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05684");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test05685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05685");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test05686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05686");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test05687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05687");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(provider5);
    }

    @Test
    public void test05688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05688");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test05689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05689");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test05690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05690");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        configuration0.refresh();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters3 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider6 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test05691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05691");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = provider9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test05692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05692");
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
        kerberosUserConfiguration1.refresh();
        java.lang.String str21 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str23 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters24 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider25 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str27 = kerberosUserConfiguration1.getType();
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
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(parameters24);
        org.junit.Assert.assertNull(provider25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test05693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05693");
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
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test05694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05694");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test05695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05695");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test05696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05696");
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
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test05697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05697");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test05698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05698");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test05699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05699");
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
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test05700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05700");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass15 = appConfigurationEntryArray14.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test05701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05701");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test05702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05702");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test05703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05703");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test05704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05704");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test05705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05705");
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
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test05706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05706");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test05707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05707");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test05708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05708");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass13 = appConfigurationEntryArray12.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test05709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05709");
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
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test05710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05710");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test05711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05711");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test05712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05712");
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
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider20 = kerberosUserConfiguration1.getProvider();
        java.lang.Class<?> wildcardClass21 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(parameters19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test05713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05713");
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
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test05714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05714");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test05715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05715");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test05716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05716");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test05717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05717");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test05718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05718");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass18 = appConfigurationEntryArray17.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test05719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05719");
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
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str19 = kerberosUserConfiguration1.getType();
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
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test05720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05720");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test05721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05721");
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
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test05722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05722");
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
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test05723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05723");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test05724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05724");
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
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test05725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05725");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str19 = kerberosUserConfiguration1.getType();
        java.lang.String str20 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test05726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05726");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test05727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05727");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test05728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05728");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test05729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05729");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test05730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05730");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test05731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05731");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test05732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05732");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
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
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test05733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05733");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test05734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05734");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test05735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05735");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test05736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05736");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test05737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05737");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test05738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05738");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test05739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05739");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test05740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05740");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test05741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05741");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test05742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05742");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test05743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05743");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test05744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05744");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test05745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05745");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test05746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05746");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test05747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05747");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test05748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05748");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test05749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05749");
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
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass18 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test05750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05750");
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
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test05751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05751");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test05752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05752");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test05753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05753");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass18 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test05754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05754");
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
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test05755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05755");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test05756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05756");
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
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test05757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05757");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = parameters13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test05758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05758");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test05759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05759");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test05760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05760");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test05761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05761");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test05762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05762");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test05763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05763");
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
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
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
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test05764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05764");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test05765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05765");
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
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        java.lang.String str19 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test05766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05766");
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
        java.lang.String str18 = kerberosUserConfiguration1.getType();
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
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test05767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05767");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test05768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05768");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass19 = kerberosUserConfiguration1.getClass();
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
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test05769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05769");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test05770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05770");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test05771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05771");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test05772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05772");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test05773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05773");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test05774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05774");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test05775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05775");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = provider16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test05776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05776");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test05777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05777");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test05778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05778");
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
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test05779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05779");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test05780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05780");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test05781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05781");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test05782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05782");
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
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test05783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05783");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test05784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05784");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test05785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05785");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test05786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05786");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test05787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05787");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass21 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test05788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05788");
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
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test05789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05789");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = provider12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test05790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05790");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test05791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05791");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters2);
    }

    @Test
    public void test05792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05792");
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
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray21 = kerberosUserConfiguration1.getAppConfigurationEntry("");
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
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(parameters19);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray21);
    }

    @Test
    public void test05793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05793");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test05794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05794");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test05795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05795");
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
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass16 = appConfigurationEntryArray15.getClass();
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test05796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05796");
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
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = parameters19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test05797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05797");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(parameters19);
        org.junit.Assert.assertNull(parameters20);
    }

    @Test
    public void test05798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05798");
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
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass20 = appConfigurationEntryArray19.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test05799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05799");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass17 = appConfigurationEntryArray16.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test05800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05800");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test05801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05801");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
    }

    @Test
    public void test05802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05802");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test05803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05803");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test05804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05804");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test05805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05805");
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
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test05806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05806");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test05807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05807");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test05808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05808");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test05809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05809");
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
        kerberosUserConfiguration1.refresh();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test05810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05810");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test05811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05811");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test05812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05812");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass14 = appConfigurationEntryArray13.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test05813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05813");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = provider11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test05814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05814");
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
        java.lang.Class<?> wildcardClass18 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test05815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05815");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider20 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(provider20);
    }

    @Test
    public void test05816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05816");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test05817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05817");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test05818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05818");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test05819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05819");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test05820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05820");
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
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test05821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05821");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test05822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05822");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test05823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05823");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test05824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05824");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test05825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05825");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        configuration0.refresh();
        java.security.Provider provider2 = configuration0.getProvider();
        java.security.Provider provider3 = configuration0.getProvider();
        java.security.Provider provider4 = configuration0.getProvider();
        java.security.Provider provider5 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider5);
    }

    @Test
    public void test05826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05826");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test05827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05827");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(parameters20);
    }

    @Test
    public void test05828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05828");
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
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test05829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05829");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test05830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05830");
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
        java.security.Provider provider19 = kerberosUserConfiguration1.getProvider();
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
        org.junit.Assert.assertNull(provider19);
    }

    @Test
    public void test05831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05831");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test05832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05832");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
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
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test05833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05833");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test05834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05834");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test05835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05835");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test05836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05836");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test05837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05837");
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
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test05838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05838");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test05839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05839");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test05840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05840");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test05841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05841");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test05842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05842");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test05843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05843");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass10 = appConfigurationEntryArray9.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test05844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05844");
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
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test05845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05845");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider19 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(provider19);
    }

    @Test
    public void test05846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05846");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(parameters20);
    }

    @Test
    public void test05847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05847");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = provider10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test05848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05848");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test05849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05849");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test05850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05850");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNull(parameters19);
        org.junit.Assert.assertNull(parameters20);
    }

    @Test
    public void test05851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05851");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test05852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05852");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test05853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05853");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test05854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05854");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test05855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05855");
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
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider20 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray22 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
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
        org.junit.Assert.assertNull(parameters19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray22);
    }

    @Test
    public void test05856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05856");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test05857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05857");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = parameters15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test05858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05858");
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
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
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
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test05859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05859");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test05860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05860");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test05861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05861");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test05862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05862");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test05863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05863");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test05864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05864");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test05865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05865");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
    }

    @Test
    public void test05866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05866");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test05867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05867");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test05868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05868");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test05869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05869");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass13 = appConfigurationEntryArray12.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test05870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05870");
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
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test05871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05871");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test05872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05872");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test05873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05873");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test05874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05874");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        java.security.Provider provider19 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass21 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test05875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05875");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test05876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05876");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test05877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05877");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        java.lang.String str19 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider21 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(parameters20);
        org.junit.Assert.assertNull(provider21);
    }

    @Test
    public void test05878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05878");
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
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test05879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05879");
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
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test05880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05880");
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
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
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
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test05881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05881");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test05882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05882");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test05883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05883");
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
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider19 = kerberosUserConfiguration1.getProvider();
        java.lang.String str20 = kerberosUserConfiguration1.getType();
        java.security.Provider provider21 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str23 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
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
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(provider21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test05884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05884");
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
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test05885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05885");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test05886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05886");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test05887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05887");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test05888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05888");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test05889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05889");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test05890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05890");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test05891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05891");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test05892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05892");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test05893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05893");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test05894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05894");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test05895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05895");
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
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test05896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05896");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test05897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05897");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test05898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05898");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test05899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05899");
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
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test05900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05900");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test05901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05901");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test05902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05902");
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
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test05903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05903");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test05904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05904");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test05905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05905");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test05906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05906");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test05907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05907");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass18 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test05908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05908");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test05909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05909");
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
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test05910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05910");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test05911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05911");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test05912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05912");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test05913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05913");
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
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test05914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05914");
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
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider19 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass21 = kerberosUserConfiguration1.getClass();
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
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test05915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05915");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test05916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05916");
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
        kerberosUserConfiguration1.refresh();
        java.lang.String str21 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str23 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass25 = kerberosUserConfiguration1.getClass();
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
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test05917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05917");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test05918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05918");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test05919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05919");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = provider8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test05920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05920");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test05921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05921");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test05922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05922");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration1.getParameters();
        java.lang.String str21 = kerberosUserConfiguration1.getType();
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
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(parameters19);
        org.junit.Assert.assertNull(parameters20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test05923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05923");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test05924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05924");
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
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(parameters18);
    }

    @Test
    public void test05925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05925");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters21 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass22 = kerberosUserConfiguration1.getClass();
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
        org.junit.Assert.assertNull(parameters21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test05926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05926");
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
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test05927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05927");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test05928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05928");
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
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test05929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05929");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test05930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05930");
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
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test05931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05931");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test05932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05932");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
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
    }

    @Test
    public void test05933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05933");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test05934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05934");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test05935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05935");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test05936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05936");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test05937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05937");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test05938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05938");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test05939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05939");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test05940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05940");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test05941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05941");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test05942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05942");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test05943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05943");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test05944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05944");
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
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test05945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05945");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
    }

    @Test
    public void test05946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05946");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test05947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05947");
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
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test05948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05948");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test05949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05949");
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
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test05950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05950");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test05951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05951");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test05952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05952");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test05953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05953");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test05954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05954");
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
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test05955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05955");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test05956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05956");
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
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test05957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05957");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass18 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test05958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05958");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test05959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05959");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
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
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test05960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05960");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test05961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05961");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test05962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05962");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test05963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05963");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test05964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05964");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test05965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05965");
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
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test05966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05966");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test05967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05967");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test05968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05968");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test05969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05969");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters22 = kerberosUserConfiguration1.getParameters();
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
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
        org.junit.Assert.assertNull(parameters22);
    }

    @Test
    public void test05970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05970");
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
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test05971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05971");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray22 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray26 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass27 = appConfigurationEntryArray26.getClass();
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
        org.junit.Assert.assertNotNull(appConfigurationEntryArray22);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test05972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05972");
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
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test05973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05973");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test05974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05974");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test05975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05975");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test05976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05976");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass19 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test05977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05977");
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
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters23 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
        org.junit.Assert.assertNull(parameters23);
    }

    @Test
    public void test05978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05978");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test05979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05979");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test05980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05980");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test05981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05981");
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
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test05982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05982");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test05983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05983");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test05984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05984");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray22 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider25 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass26 = provider25.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(appConfigurationEntryArray22);
        org.junit.Assert.assertNull(provider25);
    }

    @Test
    public void test05985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05985");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test05986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05986");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test05987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05987");
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
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test05988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05988");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test05989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05989");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test05990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05990");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = provider7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test05991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05991");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test05992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05992");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str19 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test05993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05993");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test05994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05994");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test05995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05995");
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
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test05996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05996");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass9 = appConfigurationEntryArray8.getClass();
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test05997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05997");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test05998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05998");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
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
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test05999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05999");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test06000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test06000");
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
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }
}

