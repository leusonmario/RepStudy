import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider17 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str19 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider21 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass22 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(provider21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = parameters9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray2 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        java.lang.String str2 = kerberosUserConfiguration0.getType();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray2 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass5 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.lang.String str2 = kerberosUserConfiguration0.getType();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        configuration0.refresh();
        java.security.Provider provider3 = configuration0.getProvider();
        configuration0.refresh();
        configuration0.refresh();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider9 = configuration0.getProvider();
        java.lang.Class<?> wildcardClass10 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = provider3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider3);
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider3 = configuration0.getProvider();
        java.lang.Class<?> wildcardClass4 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider2 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        configuration0.refresh();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str4 = configuration0.getType();
        java.security.Provider provider5 = configuration0.getProvider();
        java.security.Provider provider6 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        java.security.Provider provider8 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass5 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider2 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass13 = appConfigurationEntryArray12.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass6 = appConfigurationEntryArray5.getClass();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass5 = appConfigurationEntryArray4.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass9 = appConfigurationEntryArray8.getClass();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass10 = appConfigurationEntryArray9.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass10 = appConfigurationEntryArray9.getClass();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass17 = appConfigurationEntryArray16.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider2 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass13 = appConfigurationEntryArray12.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = provider9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = provider10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        configuration0.refresh();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider4 = configuration0.getProvider();
        java.security.Provider provider5 = configuration0.getProvider();
        java.security.Provider provider6 = configuration0.getProvider();
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        java.lang.String str7 = configuration0.getType();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        java.lang.Class<?> wildcardClass10 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider2 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider2 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        configuration0.refresh();
        java.security.Provider provider2 = configuration0.getProvider();
        java.security.Provider provider3 = configuration0.getProvider();
        java.lang.String str4 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.Class<?> wildcardClass6 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        configuration0.refresh();
        configuration0.refresh();
        java.security.Provider provider3 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str5 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        java.lang.Class<?> wildcardClass7 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider2 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(parameters18);
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider2 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass5 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str3 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        configuration0.refresh();
        java.security.Provider provider6 = configuration0.getProvider();
        java.lang.String str7 = configuration0.getType();
        java.lang.Class<?> wildcardClass8 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        configuration0.refresh();
        java.security.Provider provider3 = configuration0.getProvider();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.Class<?> wildcardClass9 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass13 = appConfigurationEntryArray12.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider2 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = provider8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass9 = appConfigurationEntryArray8.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider2 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        java.lang.String str2 = kerberosUserConfiguration0.getType();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass5 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass5 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        java.lang.String str5 = configuration0.getType();
        java.security.Provider provider6 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = configuration0.getParameters();
        java.lang.String str11 = configuration0.getType();
        configuration0.refresh();
        java.lang.Class<?> wildcardClass13 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = provider11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass17 = appConfigurationEntryArray16.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = parameters9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass10 = appConfigurationEntryArray9.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray2 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.lang.String str2 = kerberosUserConfiguration0.getType();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        java.lang.String str5 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters10 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = configuration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = parameters11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass21 = appConfigurationEntryArray20.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        java.lang.String str5 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = parameters8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass14 = appConfigurationEntryArray13.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider2 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass14 = appConfigurationEntryArray13.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass5 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        configuration0.refresh();
        java.security.Provider provider3 = configuration0.getProvider();
        configuration0.refresh();
        configuration0.refresh();
        configuration0.refresh();
        configuration0.refresh();
        java.security.Provider provider8 = configuration0.getProvider();
        java.lang.String str9 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str3 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        java.lang.String str5 = configuration0.getType();
        java.lang.String str6 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = parameters10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass18 = appConfigurationEntryArray17.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider2 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass5 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass7 = appConfigurationEntryArray6.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider2 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass9 = appConfigurationEntryArray8.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.Class<?> wildcardClass4 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass10 = appConfigurationEntryArray9.getClass();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.lang.String str2 = kerberosUserConfiguration0.getType();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider2 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider2 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider2 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = configuration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = parameters3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters3);
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass10 = appConfigurationEntryArray9.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass8 = appConfigurationEntryArray7.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.lang.String str2 = kerberosUserConfiguration0.getType();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = provider11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass16 = appConfigurationEntryArray15.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.lang.String str2 = kerberosUserConfiguration0.getType();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray2 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass3 = appConfigurationEntryArray2.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        java.lang.String str16 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass15 = appConfigurationEntryArray14.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = provider11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = parameters9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray2 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray2);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str3 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        configuration0.refresh();
        java.security.Provider provider3 = configuration0.getProvider();
        configuration0.refresh();
        configuration0.refresh();
        java.lang.Class<?> wildcardClass6 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider2 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = parameters11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = provider6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = parameters13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.lang.String str2 = kerberosUserConfiguration0.getType();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider2 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass7 = appConfigurationEntryArray6.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass9 = appConfigurationEntryArray8.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = parameters7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        configuration0.refresh();
        java.security.Provider provider3 = configuration0.getProvider();
        configuration0.refresh();
        configuration0.refresh();
        configuration0.refresh();
        configuration0.refresh();
        java.lang.String str8 = configuration0.getType();
        java.lang.String str9 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider2 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = provider6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        java.lang.String str5 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.lang.String str2 = kerberosUserConfiguration0.getType();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        java.lang.String str2 = kerberosUserConfiguration0.getType();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider2 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = provider7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = parameters9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider2 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = parameters12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = parameters9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        java.lang.String str2 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass5 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.lang.String str1 = configuration0.getType();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = configuration0.getParameters();
        java.lang.Class<?> wildcardClass4 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass8 = appConfigurationEntryArray7.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider2 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass13 = appConfigurationEntryArray12.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass16 = appConfigurationEntryArray15.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass13 = appConfigurationEntryArray12.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass18 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray2 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass10 = appConfigurationEntryArray9.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        java.lang.String str5 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider10 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = parameters10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = provider6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider2 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider2 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass14 = appConfigurationEntryArray13.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass15 = appConfigurationEntryArray14.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass10 = appConfigurationEntryArray9.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray2 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str16 = kerberosUserConfiguration0.getType();
        java.lang.String str17 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass10 = appConfigurationEntryArray9.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass6 = appConfigurationEntryArray5.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = provider15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = provider11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str6 = configuration0.getType();
        java.lang.Class<?> wildcardClass7 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass5 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        java.lang.String str5 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = parameters9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass14 = appConfigurationEntryArray13.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        configuration0.refresh();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str4 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        java.lang.String str6 = configuration0.getType();
        java.security.Provider provider7 = configuration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = provider7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.lang.String str2 = kerberosUserConfiguration0.getType();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = provider10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray2 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = provider13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = parameters13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass9 = appConfigurationEntryArray8.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = parameters11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.lang.String str2 = kerberosUserConfiguration0.getType();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        configuration0.refresh();
        configuration0.refresh();
        java.security.Provider provider3 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str5 = configuration0.getType();
        java.lang.String str6 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.Class<?> wildcardClass8 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray2 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass9 = appConfigurationEntryArray8.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = parameters9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass16 = appConfigurationEntryArray15.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider2 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        configuration0.refresh();
        java.lang.String str2 = configuration0.getType();
        java.security.Provider provider3 = configuration0.getProvider();
        java.lang.String str4 = configuration0.getType();
        java.security.Provider provider5 = configuration0.getProvider();
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass9 = appConfigurationEntryArray8.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider17 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass16 = appConfigurationEntryArray15.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider17 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters21 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass22 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(parameters21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        configuration0.refresh();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str4 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        java.lang.String str6 = configuration0.getType();
        java.security.Provider provider7 = configuration0.getProvider();
        java.security.Provider provider8 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray2 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = parameters5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(appConfigurationEntryArray2);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = parameters13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        configuration0.refresh();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str4 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        java.lang.String str6 = configuration0.getType();
        java.security.Provider provider7 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.Class<?> wildcardClass9 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = provider10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass5 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass14 = appConfigurationEntryArray13.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray2 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider2 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider2 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass18 = appConfigurationEntryArray17.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray2 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider2 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass13 = appConfigurationEntryArray12.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass5 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        configuration0.refresh();
        java.lang.String str3 = configuration0.getType();
        java.lang.String str4 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        configuration0.refresh();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str4 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        java.lang.String str6 = configuration0.getType();
        java.security.Provider provider7 = configuration0.getProvider();
        java.security.Provider provider8 = configuration0.getProvider();
        java.lang.String str9 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = parameters7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        java.lang.String str7 = configuration0.getType();
        java.lang.Class<?> wildcardClass8 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = parameters11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass9 = appConfigurationEntryArray8.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.lang.String str2 = kerberosUserConfiguration0.getType();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider15 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass9 = appConfigurationEntryArray8.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass18 = appConfigurationEntryArray17.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider2 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = parameters6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        configuration0.refresh();
        java.lang.String str4 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray2 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = provider7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = parameters7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        configuration0.refresh();
        java.security.Provider provider3 = configuration0.getProvider();
        configuration0.refresh();
        configuration0.refresh();
        configuration0.refresh();
        java.lang.String str7 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        java.lang.String str7 = configuration0.getType();
        java.security.Provider provider8 = configuration0.getProvider();
        configuration0.refresh();
        java.lang.Class<?> wildcardClass10 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
}

