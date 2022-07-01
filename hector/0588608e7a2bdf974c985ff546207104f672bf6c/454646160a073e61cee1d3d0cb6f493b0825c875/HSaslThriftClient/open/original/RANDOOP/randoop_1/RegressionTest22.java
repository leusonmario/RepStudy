import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest22 {

    public static boolean debug = false;

    @Test
    public void test11001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11001");
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
        kerberosUserConfiguration0.refresh();
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider19 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(provider19);
    }

    @Test
    public void test11002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11002");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test11003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11003");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11004");
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
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test11005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11005");
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
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = parameters14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test11006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11006");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test11007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11007");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test11008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11008");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration0.getParameters();
        java.lang.String str18 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test11009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11009");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider17 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration0.getParameters();
        java.lang.String str21 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(parameters20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test11010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11010");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test11011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11011");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test11012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11012");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test11013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11013");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test11014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11014");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test11015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11015");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11016");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11017");
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
        java.lang.String str17 = kerberosUserConfiguration0.getType();
        java.security.Provider provider18 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test11018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11018");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test11019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11019");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration0.getParameters();
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
        org.junit.Assert.assertNull(parameters18);
    }

    @Test
    public void test11020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11020");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        java.lang.String str16 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test11021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11021");
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
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11022");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test11023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11023");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11024");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test11025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11025");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test11026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11026");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        java.lang.String str2 = kerberosUserConfiguration0.getType();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11027");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test11028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11028");
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
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test11029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11029");
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
        java.lang.String str16 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test11030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11030");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str17 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
    }

    @Test
    public void test11031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11031");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test11032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11032");
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
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str16 = kerberosUserConfiguration0.getType();
        java.lang.String str17 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.String str20 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test11033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11033");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray21 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray23 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass25 = kerberosUserConfiguration0.getClass();
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
        org.junit.Assert.assertNotNull(appConfigurationEntryArray23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test11034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11034");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11035");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test11036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11036");
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
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test11037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11037");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(parameters18);
    }

    @Test
    public void test11038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11038");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test11039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11039");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test11040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11040");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test11041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11041");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test11042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11042");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration0.getParameters();
        java.lang.String str17 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test11043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11043");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test11044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11044");
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
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
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
    }

    @Test
    public void test11045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11045");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass20 = kerberosUserConfiguration0.getClass();
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
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test11046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11046");
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
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11047");
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
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str17 = kerberosUserConfiguration0.getType();
        java.lang.String str18 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test11048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11048");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider18 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str20 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test11049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11049");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test11050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11050");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test11051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11051");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test11052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11052");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test11053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11053");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11054");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test11055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11055");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test11056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11056");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test11057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11057");
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
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = parameters14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test11058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11058");
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
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test11059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11059");
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
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str21 = kerberosUserConfiguration0.getType();
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
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test11060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11060");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test11061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11061");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test11062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11062");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test11063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11063");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11064");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test11065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11065");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        java.lang.String str2 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test11066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11066");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test11067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11067");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test11068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11068");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test11069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11069");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test11070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11070");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test11071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11071");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11072");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test11073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11073");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11074");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test11075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11075");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11076");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider17 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
    }

    @Test
    public void test11077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11077");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        java.lang.String str16 = kerberosUserConfiguration0.getType();
        java.security.Provider provider17 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test11078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11078");
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
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test11079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11079");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11080");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11081");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test11082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11082");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        configuration0.refresh();
        configuration0.refresh();
        configuration0.refresh();
        java.lang.String str5 = configuration0.getType();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test11083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11083");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test11084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11084");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11085");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11086");
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
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11087");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test11088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11088");
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
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test11089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11089");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters3 = configuration0.getParameters();
        java.security.Provider provider4 = configuration0.getProvider();
        java.lang.String str5 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        java.lang.String str8 = configuration0.getType();
        java.security.Provider provider9 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test11090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11090");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11091");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11092");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test11093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11093");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider17 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str21 = kerberosUserConfiguration0.getType();
        java.security.Provider provider22 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider23 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(provider22);
        org.junit.Assert.assertNull(provider23);
    }

    @Test
    public void test11094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11094");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = parameters9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test11095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11095");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test11096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11096");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test11097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11097");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test11098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11098");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test11099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11099");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test11100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11100");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11101");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test11102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11102");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass18 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11103");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11104");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test11105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11105");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str17 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass18 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11106");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test11107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11107");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
    }

    @Test
    public void test11108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11108");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test11109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11109");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test11110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11110");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11111");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration0.getParameters();
        java.lang.String str19 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray21 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass22 = appConfigurationEntryArray21.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test11112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11112");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        java.lang.String str2 = kerberosUserConfiguration0.getType();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test11113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11113");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test11114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11114");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test11115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11115");
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
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str16 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider18 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test11116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11116");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test11117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11117");
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
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider17 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider20 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(provider20);
    }

    @Test
    public void test11118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11118");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test11119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11119");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test11120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11120");
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
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test11121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11121");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("");
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
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test11122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11122");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test11123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11123");
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
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.lang.String str21 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters22 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(parameters22);
    }

    @Test
    public void test11124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11124");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11125");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str18 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test11126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11126");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test11127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11127");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11128");
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
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11129");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider17 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test11130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11130");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test11131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11131");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test11132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11132");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test11133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11133");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test11134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11134");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test11135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11135");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test11136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11136");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test11137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11137");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass13 = appConfigurationEntryArray12.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11138");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test11139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11139");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
    }

    @Test
    public void test11140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11140");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test11141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11141");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test11142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11142");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11143");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11144");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11145");
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
        kerberosUserConfiguration0.refresh();
        java.lang.String str16 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str20 = kerberosUserConfiguration0.getType();
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test11146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11146");
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
        java.lang.String str17 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
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
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test11147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11147");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test11148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11148");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test11149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11149");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11150");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test11151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11151");
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
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test11152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11152");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test11153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11153");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test11154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11154");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11155");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11156");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass13 = appConfigurationEntryArray12.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11157");
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
        java.security.Provider provider17 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
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
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test11158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11158");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
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
    public void test11159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11159");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        configuration0.refresh();
        configuration0.refresh();
        configuration0.refresh();
        configuration0.refresh();
        java.lang.String str6 = configuration0.getType();
        java.lang.String str7 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        java.security.Provider provider9 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test11160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11160");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test11161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11161");
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
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = parameters18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(parameters18);
    }

    @Test
    public void test11162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11162");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11163");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test11164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11164");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        java.lang.String str2 = kerberosUserConfiguration0.getType();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test11165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11165");
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
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test11166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11166");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
    }

    @Test
    public void test11167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11167");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test11168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11168");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test11169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11169");
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
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11170");
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
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11171");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test11172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11172");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test11173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11173");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test11174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11174");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test11175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11175");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11176");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test11177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11177");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test11178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11178");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test11179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11179");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test11180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11180");
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
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
    }

    @Test
    public void test11181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11181");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test11182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11182");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11183");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11184");
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
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test11185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11185");
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
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test11186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11186");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test11187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11187");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test11188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11188");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test11189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11189");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11190");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters3 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
    }

    @Test
    public void test11191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11191");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test11192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11192");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test11193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11193");
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
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test11194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11194");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11195");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11196");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test11197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11197");
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
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider17 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
    }

    @Test
    public void test11198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11198");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test11199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11199");
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
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11200");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test11201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11201");
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
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11202");
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
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11203");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider18 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test11204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11204");
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
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration0.getParameters();
        java.lang.String str17 = kerberosUserConfiguration0.getType();
        java.lang.String str18 = kerberosUserConfiguration0.getType();
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
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test11205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11205");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass16 = appConfigurationEntryArray15.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11206");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test11207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11207");
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
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider21 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray23 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
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
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
        org.junit.Assert.assertNull(provider21);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray23);
    }

    @Test
    public void test11208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11208");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test11209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11209");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11210");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test11211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11211");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test11212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11212");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test11213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11213");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test11214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11214");
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
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = provider12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test11215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11215");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test11216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11216");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11217");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11218");
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
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        java.lang.String str16 = kerberosUserConfiguration0.getType();
        java.lang.String str17 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test11219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11219");
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
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test11220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11220");
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
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test11221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11221");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider20 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters21 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters22 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(parameters19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(parameters21);
        org.junit.Assert.assertNull(parameters22);
    }

    @Test
    public void test11222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11222");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        java.lang.String str2 = kerberosUserConfiguration0.getType();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test11223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11223");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider17 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test11224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11224");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test11225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11225");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test11226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11226");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test11227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11227");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test11228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11228");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test11229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11229");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11230");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test11231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11231");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test11232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11232");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test11233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11233");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test11234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11234");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11235");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str20 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray22 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray22);
    }

    @Test
    public void test11236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11236");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.lang.String str2 = configuration0.getType();
        configuration0.refresh();
        java.lang.String str4 = configuration0.getType();
        java.security.Provider provider5 = configuration0.getProvider();
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
    }

    @Test
    public void test11237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11237");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test11238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11238");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass17 = appConfigurationEntryArray16.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11239");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test11240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11240");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
    }

    @Test
    public void test11241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11241");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
    }

    @Test
    public void test11242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11242");
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
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider19 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(provider19);
    }

    @Test
    public void test11243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11243");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test11244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11244");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test11245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11245");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test11246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11246");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = provider13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test11247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11247");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass20 = appConfigurationEntryArray19.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test11248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11248");
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
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider19 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str21 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test11249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11249");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11250");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test11251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11251");
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
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11252");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test11253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11253");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test11254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11254");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11255");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11256");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test11257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11257");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test11258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11258");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str16 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = parameters17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test11259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11259");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test11260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11260");
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
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass18 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11261");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test11262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11262");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test11263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11263");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11264");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test11265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11265");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11266");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11267");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11268");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test11269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11269");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test11270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11270");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11271");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass19 = appConfigurationEntryArray18.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11272");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test11273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11273");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass18 = appConfigurationEntryArray17.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11274");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11275");
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
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test11276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11276");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test11277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11277");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test11278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11278");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test11279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11279");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test11280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11280");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test11281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11281");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test11282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11282");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        java.lang.String str16 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test11283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11283");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test11284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11284");
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
        javax.security.auth.login.Configuration.Parameters parameters11 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test11285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11285");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11286");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test11287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11287");
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
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test11288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11288");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11289");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test11290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11290");
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
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test11291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11291");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test11292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11292");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider17 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test11293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11293");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str5 = configuration0.getType();
        java.security.Provider provider6 = configuration0.getProvider();
        java.lang.String str7 = configuration0.getType();
        java.security.Provider provider8 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test11294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11294");
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
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider17 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray22 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass23 = appConfigurationEntryArray22.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(parameters20);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test11295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11295");
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
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test11296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11296");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11297");
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
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters22 = kerberosUserConfiguration0.getParameters();
        java.lang.String str23 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
        org.junit.Assert.assertNull(parameters22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test11298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11298");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test11299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11299");
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
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test11300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11300");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test11301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11301");
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
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str17 = kerberosUserConfiguration0.getType();
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
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test11302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11302");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test11303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11303");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test11304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11304");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11305");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test11306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11306");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
    }

    @Test
    public void test11307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11307");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test11308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11308");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test11309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11309");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11310");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test11311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11311");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test11312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11312");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11313");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters21 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
        org.junit.Assert.assertNull(parameters21);
    }

    @Test
    public void test11314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11314");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test11315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11315");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test11316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11316");
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
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11317");
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
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
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
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test11318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11318");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test11319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11319");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        java.lang.String str2 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test11320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11320");
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
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11321");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
    }

    @Test
    public void test11322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11322");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test11323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11323");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test11324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11324");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test11325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11325");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider18 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test11326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11326");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test11327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11327");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test11328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11328");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test11329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11329");
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
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test11330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11330");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test11331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11331");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11332");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test11333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11333");
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
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test11334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11334");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test11335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11335");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11336");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test11337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11337");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test11338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11338");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11339");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass14 = appConfigurationEntryArray13.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11340");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test11341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11341");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test11342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11342");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test11343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11343");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11344");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test11345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11345");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test11346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11346");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test11347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11347");
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
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11348");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.String str16 = kerberosUserConfiguration0.getType();
        java.lang.String str17 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test11349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11349");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test11350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11350");
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
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str17 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass18 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11351");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11352");
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
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test11353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11353");
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
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str19 = kerberosUserConfiguration0.getType();
        java.security.Provider provider20 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider21 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(provider21);
    }

    @Test
    public void test11354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11354");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test11355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11355");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11356");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test11357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11357");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test11358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11358");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = parameters14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test11359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11359");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test11360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11360");
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
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test11361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11361");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test11362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11362");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test11363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11363");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11364");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test11365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11365");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test11366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11366");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test11367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11367");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test11368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11368");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test11369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11369");
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
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test11370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11370");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass16 = appConfigurationEntryArray15.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11371");
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
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test11372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11372");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test11373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11373");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test11374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11374");
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
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11375");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test11376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11376");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str19 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray21 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str22 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters23 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(parameters23);
    }

    @Test
    public void test11377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11377");
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
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test11378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11378");
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
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test11379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11379");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test11380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11380");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test11381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11381");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test11382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11382");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11383");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11384");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test11385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11385");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test11386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11386");
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
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str17 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass18 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11387");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider20 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(provider20);
    }

    @Test
    public void test11388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11388");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11389");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test11390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11390");
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
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11391");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test11392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11392");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11393");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test11394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11394");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11395");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test11396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11396");
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
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11397");
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
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test11398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11398");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test11399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11399");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider18 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test11400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11400");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        java.lang.String str2 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test11401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11401");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test11402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11402");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test11403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11403");
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
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str18 = kerberosUserConfiguration0.getType();
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
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test11404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11404");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11405");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test11406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11406");
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
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test11407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11407");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test11408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11408");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test11409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11409");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test11410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11410");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11411");
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
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test11412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11412");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test11413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11413");
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
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test11414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11414");
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
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
        java.lang.String str17 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test11415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11415");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test11416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11416");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test11417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11417");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        java.lang.String str16 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass19 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11418");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test11419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11419");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test11420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11420");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        configuration0.refresh();
        java.lang.Class<?> wildcardClass8 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test11421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11421");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        java.lang.String str16 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(parameters18);
    }

    @Test
    public void test11422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11422");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test11423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11423");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test11424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11424");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider17 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test11425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11425");
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
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test11426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11426");
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
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11427");
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
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test11428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11428");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test11429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11429");
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
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test11430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11430");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass13 = appConfigurationEntryArray12.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11431");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test11432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11432");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11433");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test11434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11434");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test11435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11435");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        java.lang.String str2 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11436");
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
        java.security.Provider provider20 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray22 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
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
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray22);
    }

    @Test
    public void test11437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11437");
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
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11438");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider5);
    }

    @Test
    public void test11439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11439");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11440");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test11441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11441");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11442");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test11443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11443");
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
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test11444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11444");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test11445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11445");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11446");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass19 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11447");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test11448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11448");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test11449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11449");
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
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11450");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test11451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11451");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test11452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11452");
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
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
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
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test11453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11453");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test11454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11454");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11455");
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
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11456");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test11457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11457");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray21 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray23 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters24 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = parameters24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray21);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray23);
        org.junit.Assert.assertNull(parameters24);
    }

    @Test
    public void test11458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11458");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11459");
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
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str16 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test11460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11460");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11461");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test11462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11462");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11463");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test11464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11464");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test11465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11465");
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
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11466");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test11467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11467");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test11468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11468");
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
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider17 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider19 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider20 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray23 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray23);
    }

    @Test
    public void test11469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11469");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11470");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test11471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11471");
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
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test11472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11472");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.lang.String str16 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test11473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11473");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test11474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11474");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test11475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11475");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test11476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11476");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test11477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11477");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test11478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11478");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str18 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test11479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11479");
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
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider17 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider18 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test11480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11480");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test11481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11481");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11482");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11483");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11484");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test11485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11485");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider17 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test11486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11486");
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
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test11487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11487");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test11488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11488");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test11489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11489");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test11490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11490");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass19 = appConfigurationEntryArray18.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11491");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test11492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11492");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str17 = kerberosUserConfiguration0.getType();
        java.security.Provider provider18 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test11493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11493");
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
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test11494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11494");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test11495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11495");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test11496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11496");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test11497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11497");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test11498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11498");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11499");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.String str19 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test11500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11500");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }
}

