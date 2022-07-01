import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

    public static boolean debug = false;

    @Test
    public void test07501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07501");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test07502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07502");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test07503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07503");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test07504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07504");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test07505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07505");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider17 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test07506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07506");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider17 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test07507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07507");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test07508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07508");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test07509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07509");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test07510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07510");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test07511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07511");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
    }

    @Test
    public void test07512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07512");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test07513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07513");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test07514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07514");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test07515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07515");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = provider14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test07516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07516");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test07517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07517");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test07518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07518");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider17 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str19 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test07519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07519");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        java.lang.String str16 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test07520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07520");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test07521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07521");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test07522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07522");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test07523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07523");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test07524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07524");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test07525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07525");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test07526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07526");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test07527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07527");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test07528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07528");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test07529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07529");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray2 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass7 = appConfigurationEntryArray6.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test07530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07530");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test07531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07531");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test07532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07532");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test07533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07533");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = configuration0.getParameters();
        configuration0.refresh();
        java.lang.String str5 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test07534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07534");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
    }

    @Test
    public void test07535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07535");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str19 = kerberosUserConfiguration0.getType();
        java.security.Provider provider20 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters21 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(parameters21);
    }

    @Test
    public void test07536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07536");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test07537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07537");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test07538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07538");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test07539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07539");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = provider12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test07540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07540");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        java.lang.String str16 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test07541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07541");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test07542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07542");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test07543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07543");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test07544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07544");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration0.getParameters();
        java.lang.String str17 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str19 = kerberosUserConfiguration0.getType();
        java.security.Provider provider20 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray22 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray22);
    }

    @Test
    public void test07545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07545");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = provider8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test07546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07546");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        java.lang.String str2 = kerberosUserConfiguration0.getType();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider5);
    }

    @Test
    public void test07547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07547");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass18 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test07548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07548");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test07549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07549");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test07550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07550");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test07551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07551");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test07552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07552");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test07553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07553");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test07554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07554");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str16 = kerberosUserConfiguration0.getType();
        java.security.Provider provider17 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test07555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07555");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test07556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07556");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test07557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07557");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test07558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07558");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test07559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07559");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test07560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07560");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test07561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07561");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test07562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07562");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test07563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07563");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test07564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07564");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test07565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07565");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test07566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07566");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test07567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07567");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test07568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07568");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test07569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07569");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test07570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07570");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass17 = appConfigurationEntryArray16.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test07571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07571");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test07572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07572");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test07573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07573");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test07574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07574");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str4 = configuration0.getType();
        java.security.Provider provider5 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test07575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07575");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test07576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07576");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str16 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test07577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07577");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test07578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07578");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test07579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07579");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(parameters18);
    }

    @Test
    public void test07580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07580");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test07581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07581");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test07582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07582");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test07583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07583");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test07584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07584");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test07585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07585");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test07586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07586");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider6 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test07587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07587");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test07588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07588");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass9 = appConfigurationEntryArray8.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test07589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07589");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test07590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07590");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test07591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07591");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test07592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07592");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test07593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07593");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test07594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07594");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test07595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07595");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test07596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07596");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = parameters13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test07597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07597");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test07598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07598");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test07599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07599");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test07600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07600");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test07601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07601");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test07602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07602");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test07603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07603");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = parameters10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test07604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07604");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test07605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07605");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test07606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07606");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test07607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07607");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test07608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07608");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test07609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07609");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test07610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07610");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test07611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07611");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test07612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07612");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test07613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07613");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test07614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07614");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test07615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07615");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test07616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07616");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test07617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07617");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test07618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07618");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test07619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07619");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration0.getParameters();
        java.lang.String str18 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test07620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07620");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test07621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07621");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test07622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07622");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str17 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test07623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07623");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters21 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(parameters20);
        org.junit.Assert.assertNull(parameters21);
    }

    @Test
    public void test07624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07624");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test07625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07625");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test07626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07626");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test07627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07627");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test07628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07628");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test07629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07629");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test07630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07630");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test07631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07631");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test07632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07632");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test07633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07633");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str20 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test07634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07634");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test07635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07635");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider20 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(provider20);
    }

    @Test
    public void test07636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07636");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider18 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test07637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07637");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test07638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07638");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test07639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07639");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass18 = appConfigurationEntryArray17.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test07640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07640");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test07641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07641");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test07642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07642");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test07643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07643");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test07644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07644");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test07645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07645");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test07646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07646");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        java.lang.String str2 = kerberosUserConfiguration0.getType();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
    }

    @Test
    public void test07647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07647");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test07648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07648");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider17 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test07649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07649");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test07650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07650");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test07651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07651");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test07652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07652");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str19 = kerberosUserConfiguration0.getType();
        java.lang.String str20 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray22 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str23 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass24 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test07653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07653");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test07654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07654");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test07655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07655");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test07656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07656");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test07657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07657");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider17 = kerberosUserConfiguration0.getProvider();
        java.lang.String str18 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test07658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07658");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test07659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07659");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test07660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07660");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test07661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07661");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.lang.String str19 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str21 = kerberosUserConfiguration0.getType();
        java.security.Provider provider22 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(provider22);
    }

    @Test
    public void test07662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07662");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test07663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07663");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test07664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07664");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test07665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07665");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test07666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07666");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str16 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider18 = kerberosUserConfiguration0.getProvider();
        java.lang.String str19 = kerberosUserConfiguration0.getType();
        java.security.Provider provider20 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(provider20);
    }

    @Test
    public void test07667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07667");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test07668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07668");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        java.lang.String str16 = kerberosUserConfiguration0.getType();
        java.lang.String str17 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
    }

    @Test
    public void test07669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07669");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test07670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07670");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test07671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07671");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test07672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07672");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test07673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07673");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test07674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07674");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test07675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07675");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test07676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07676");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test07677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07677");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test07678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07678");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider18 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray22 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray22);
    }

    @Test
    public void test07679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07679");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test07680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07680");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test07681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07681");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test07682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07682");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = provider4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(provider4);
    }

    @Test
    public void test07683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07683");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass18 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test07684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07684");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test07685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07685");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test07686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07686");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test07687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07687");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test07688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07688");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test07689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07689");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test07690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07690");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass19 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test07691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07691");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test07692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07692");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test07693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07693");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test07694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07694");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test07695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07695");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test07696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07696");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test07697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07697");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test07698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07698");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test07699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07699");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test07700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07700");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test07701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07701");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass18 = appConfigurationEntryArray17.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test07702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07702");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider17 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = provider17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test07703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07703");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test07704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07704");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass13 = appConfigurationEntryArray12.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test07705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07705");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        java.lang.String str16 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test07706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07706");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test07707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07707");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test07708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07708");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test07709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07709");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test07710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07710");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider17 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
    }

    @Test
    public void test07711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07711");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test07712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07712");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test07713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07713");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test07714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07714");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test07715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07715");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test07716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07716");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test07717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07717");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test07718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07718");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test07719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07719");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test07720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07720");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test07721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07721");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test07722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07722");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test07723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07723");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test07724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07724");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test07725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07725");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test07726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07726");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test07727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07727");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test07728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07728");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test07729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07729");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass17 = appConfigurationEntryArray16.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test07730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07730");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test07731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07731");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test07732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07732");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test07733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07733");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test07734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07734");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = provider15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test07735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07735");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test07736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07736");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test07737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07737");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider18 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test07738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07738");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test07739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07739");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider17 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters22 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider23 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
        org.junit.Assert.assertNull(parameters22);
        org.junit.Assert.assertNull(provider23);
    }

    @Test
    public void test07740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07740");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test07741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07741");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test07742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07742");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test07743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07743");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test07744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07744");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test07745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07745");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test07746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07746");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test07747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07747");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test07748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07748");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test07749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07749");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test07750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07750");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test07751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07751");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test07752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07752");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test07753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07753");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test07754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07754");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test07755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07755");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test07756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07756");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
    }

    @Test
    public void test07757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07757");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test07758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07758");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test07759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07759");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str17 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test07760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07760");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test07761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07761");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test07762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07762");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test07763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07763");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test07764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07764");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test07765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07765");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test07766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07766");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test07767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07767");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test07768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07768");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test07769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07769");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test07770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07770");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test07771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07771");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test07772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07772");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test07773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07773");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test07774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07774");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test07775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07775");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test07776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07776");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test07777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07777");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test07778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07778");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test07779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07779");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test07780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07780");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = provider12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test07781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07781");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test07782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07782");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test07783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07783");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test07784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07784");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test07785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07785");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test07786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07786");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test07787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07787");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test07788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07788");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test07789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07789");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        java.lang.String str16 = kerberosUserConfiguration0.getType();
        java.lang.String str17 = kerberosUserConfiguration0.getType();
        java.security.Provider provider18 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test07790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07790");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test07791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07791");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test07792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07792");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test07793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07793");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = parameters11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test07794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07794");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider3 = configuration0.getProvider();
        java.lang.String str4 = configuration0.getType();
        java.security.Provider provider5 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
    }

    @Test
    public void test07795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07795");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test07796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07796");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test07797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07797");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test07798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07798");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test07799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07799");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test07800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07800");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test07801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07801");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test07802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07802");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str17 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test07803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07803");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test07804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07804");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider19 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider20 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters21 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(parameters21);
    }

    @Test
    public void test07805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07805");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test07806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07806");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test07807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07807");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test07808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07808");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters3 = configuration0.getParameters();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
    }

    @Test
    public void test07809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07809");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test07810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07810");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test07811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07811");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test07812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07812");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test07813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07813");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test07814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07814");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test07815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07815");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = parameters12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test07816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07816");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test07817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07817");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test07818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07818");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider17 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test07819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07819");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test07820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07820");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test07821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07821");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test07822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07822");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test07823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07823");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test07824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07824");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test07825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07825");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test07826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07826");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = parameters15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test07827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07827");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test07828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07828");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test07829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07829");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test07830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07830");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test07831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07831");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test07832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07832");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test07833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07833");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test07834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07834");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test07835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07835");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test07836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07836");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test07837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07837");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test07838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07838");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test07839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07839");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test07840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07840");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str16 = kerberosUserConfiguration0.getType();
        java.lang.String str17 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test07841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07841");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test07842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07842");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = provider8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test07843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07843");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test07844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07844");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration0.getParameters();
        java.lang.String str17 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test07845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07845");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test07846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07846");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str17 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test07847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07847");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test07848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07848");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.String str19 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test07849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07849");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test07850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07850");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test07851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07851");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test07852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07852");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test07853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07853");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test07854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07854");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test07855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07855");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test07856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07856");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass13 = appConfigurationEntryArray12.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test07857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07857");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test07858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07858");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test07859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07859");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str18 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test07860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07860");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test07861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07861");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider18 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray21 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider22 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray21);
        org.junit.Assert.assertNull(provider22);
    }

    @Test
    public void test07862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07862");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test07863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07863");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test07864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07864");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test07865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07865");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass15 = appConfigurationEntryArray14.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test07866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07866");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test07867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07867");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str16 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test07868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07868");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test07869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07869");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test07870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07870");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test07871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07871");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test07872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07872");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test07873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07873");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test07874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07874");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test07875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07875");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test07876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07876");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test07877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07877");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test07878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07878");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test07879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07879");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test07880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07880");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test07881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07881");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test07882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07882");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        java.lang.String str16 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider18 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test07883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07883");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test07884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07884");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test07885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07885");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test07886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07886");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test07887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07887");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test07888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07888");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
    }

    @Test
    public void test07889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07889");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test07890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07890");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test07891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07891");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test07892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07892");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test07893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07893");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.lang.String str18 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray22 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray24 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray22);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray24);
    }

    @Test
    public void test07894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07894");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test07895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07895");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test07896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07896");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test07897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07897");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test07898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07898");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test07899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07899");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test07900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07900");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
    }

    @Test
    public void test07901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07901");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test07902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07902");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test07903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07903");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test07904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07904");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test07905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07905");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test07906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07906");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test07907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07907");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str20 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test07908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07908");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test07909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07909");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test07910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07910");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test07911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07911");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        java.lang.String str16 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test07912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07912");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test07913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07913");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test07914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07914");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test07915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07915");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test07916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07916");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = parameters13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test07917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07917");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = provider15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test07918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07918");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test07919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07919");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test07920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07920");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass14 = appConfigurationEntryArray13.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test07921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07921");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test07922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07922");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str17 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(parameters18);
    }

    @Test
    public void test07923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07923");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
    }

    @Test
    public void test07924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07924");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test07925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07925");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test07926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07926");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test07927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07927");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test07928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07928");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test07929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07929");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test07930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07930");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass20 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(parameters19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test07931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07931");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test07932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07932");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = parameters12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test07933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07933");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test07934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07934");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test07935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07935");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test07936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07936");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test07937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07937");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test07938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07938");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test07939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07939");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        configuration0.refresh();
        java.lang.String str3 = configuration0.getType();
        java.security.Provider provider4 = configuration0.getProvider();
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
    }

    @Test
    public void test07940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07940");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test07941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07941");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test07942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07942");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test07943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07943");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test07944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07944");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test07945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07945");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test07946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07946");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test07947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07947");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test07948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07948");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test07949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07949");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test07950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07950");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = parameters9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test07951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07951");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test07952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07952");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test07953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07953");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = parameters8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test07954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07954");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test07955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07955");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test07956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07956");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test07957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07957");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test07958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07958");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider17 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = provider17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test07959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07959");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
    }

    @Test
    public void test07960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07960");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test07961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07961");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
    }

    @Test
    public void test07962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07962");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test07963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07963");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test07964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07964");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test07965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07965");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test07966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07966");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test07967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07967");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = provider12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test07968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07968");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test07969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07969");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test07970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07970");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test07971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07971");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
    }

    @Test
    public void test07972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07972");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test07973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07973");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test07974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07974");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test07975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07975");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test07976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07976");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str17 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test07977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07977");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test07978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07978");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test07979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07979");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test07980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07980");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider18 = kerberosUserConfiguration0.getProvider();
        java.lang.String str19 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test07981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07981");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test07982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07982");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test07983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07983");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test07984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07984");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider17 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
    }

    @Test
    public void test07985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07985");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test07986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07986");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test07987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07987");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test07988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07988");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test07989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07989");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test07990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07990");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test07991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07991");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test07992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07992");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider17 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider18 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str21 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test07993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07993");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test07994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07994");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = provider9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test07995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07995");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test07996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07996");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        configuration0.refresh();
        configuration0.refresh();
        configuration0.refresh();
        java.lang.String str5 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        java.security.Provider provider7 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        java.security.Provider provider10 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test07997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07997");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test07998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07998");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test07999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07999");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test08000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test08000");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
    }
}

