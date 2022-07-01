import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        javax.security.auth.login.Configuration.Parameters parameters1 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.security.auth.login.Configuration configuration2 = javax.security.auth.login.Configuration.getInstance("", parameters1);
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException; message:  Configuration not available");
        } catch (java.security.NoSuchAlgorithmException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        javax.security.auth.login.Configuration.Parameters parameters1 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.security.auth.login.Configuration configuration3 = javax.security.auth.login.Configuration.getInstance("hi!", parameters1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: missing provider");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        javax.security.auth.login.Configuration.Parameters parameters1 = null;
        java.security.Provider provider2 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.security.auth.login.Configuration configuration3 = javax.security.auth.login.Configuration.getInstance("hi!", parameters1, provider2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: missing provider");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.apache.thrift.transport.TTransport tTransport0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.thrift.transport.TTransport tTransport2 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.openKerberosTransport(tTransport0, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.thrift.transport.TTransportException; message: Failed to open secure transport using KERBEROS");
        } catch (org.apache.thrift.transport.TTransportException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        javax.security.auth.login.Configuration.Parameters parameters1 = null;
        java.security.Provider provider2 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.security.auth.login.Configuration configuration3 = javax.security.auth.login.Configuration.getInstance("", parameters1, provider2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: missing provider");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        javax.security.auth.login.Configuration.Parameters parameters1 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.security.auth.login.Configuration configuration2 = javax.security.auth.login.Configuration.getInstance("hi!", parameters1);
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException; message: hi! Configuration not available");
        } catch (java.security.NoSuchAlgorithmException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        javax.security.auth.login.Configuration.Parameters parameters1 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.security.auth.login.Configuration configuration3 = javax.security.auth.login.Configuration.getInstance("", parameters1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: missing provider");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass5 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.apache.thrift.transport.TTransport tTransport0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.thrift.transport.TTransport tTransport2 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.openKerberosTransport(tTransport0, "");
            org.junit.Assert.fail("Expected exception of type org.apache.thrift.transport.TTransportException; message: Failed to open secure transport using KERBEROS");
        } catch (org.apache.thrift.transport.TTransportException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        javax.security.auth.login.Configuration configuration0 = null;
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass2 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass2 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass4 = appConfigurationEntryArray3.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        javax.security.auth.login.Configuration.Parameters parameters1 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.security.auth.login.Configuration configuration3 = javax.security.auth.login.Configuration.getInstance("hi!", parameters1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchProviderException; message: no such provider: hi!");
        } catch (java.security.NoSuchProviderException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass5 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        javax.security.auth.login.Configuration.Parameters parameters1 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.security.auth.login.Configuration configuration3 = javax.security.auth.login.Configuration.getInstance("", parameters1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchProviderException; message: no such provider: hi!");
        } catch (java.security.NoSuchProviderException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        configuration0.refresh();
        java.lang.Class<?> wildcardClass3 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.Class<?> wildcardClass1 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass4 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass5 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass3 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass3 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.lang.Class<?> wildcardClass1 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass5 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass8 = appConfigurationEntryArray7.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass5 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass5 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = provider6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.SASL_PROPS;
        java.lang.Class<?> wildcardClass1 = strMap0.getClass();
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
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
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass9 = appConfigurationEntryArray8.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass9 = appConfigurationEntryArray8.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.Class<?> wildcardClass4 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
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
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass2 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        java.lang.Class<?> wildcardClass5 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass5 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = provider4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider4);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = parameters7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.Class<?> wildcardClass2 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.lang.Class<?> wildcardClass2 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = parameters4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = parameters8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
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
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass5 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass9 = appConfigurationEntryArray8.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass8 = appConfigurationEntryArray7.getClass();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass4 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = provider8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = parameters7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
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
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass10 = appConfigurationEntryArray9.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
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
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass4 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        java.lang.Class<?> wildcardClass4 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = provider1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass5 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
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
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = provider8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = provider6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = provider5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider5);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = parameters6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
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
        java.lang.Class<?> wildcardClass13 = appConfigurationEntryArray12.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = parameters11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
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
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass5 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
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
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass3 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        java.security.Provider provider2 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider2);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
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
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
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
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
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
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = provider11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
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
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        configuration0.refresh();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider6 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = parameters7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = parameters6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass4 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass5 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass9 = appConfigurationEntryArray8.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
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
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = parameters6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
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
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
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
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass8 = appConfigurationEntryArray7.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
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
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
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
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass13 = appConfigurationEntryArray12.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass8 = appConfigurationEntryArray7.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        configuration0.refresh();
        configuration0.refresh();
        configuration0.refresh();
        java.lang.Class<?> wildcardClass5 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = parameters10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass9 = appConfigurationEntryArray8.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
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
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
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
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass4 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass10 = appConfigurationEntryArray9.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = parameters7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
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
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
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
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
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
        java.lang.Class<?> wildcardClass14 = appConfigurationEntryArray13.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass5 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = parameters8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
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
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = parameters9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
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
        java.lang.Class<?> wildcardClass15 = appConfigurationEntryArray14.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = parameters6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = parameters13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
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
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass10 = appConfigurationEntryArray9.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = provider11.getClass();
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
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
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
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = parameters11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
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
        java.lang.Class<?> wildcardClass14 = appConfigurationEntryArray13.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass8 = appConfigurationEntryArray7.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass10 = appConfigurationEntryArray9.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
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
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
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
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = provider5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
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
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
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
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass9 = appConfigurationEntryArray8.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
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
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass5 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = parameters9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
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
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = provider6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = parameters4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
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
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
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
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass10 = appConfigurationEntryArray9.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = provider5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
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
        java.lang.Class<?> wildcardClass16 = appConfigurationEntryArray15.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
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
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = provider11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.Class<?> wildcardClass5 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass8 = appConfigurationEntryArray7.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
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
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass9 = appConfigurationEntryArray8.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
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
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass15 = appConfigurationEntryArray14.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass8 = appConfigurationEntryArray7.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = provider7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
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
        java.lang.Class<?> wildcardClass16 = appConfigurationEntryArray15.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
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
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass6 = appConfigurationEntryArray5.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
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
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
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
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        java.lang.Class<?> wildcardClass5 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
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
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
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
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = provider10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
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
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass6 = appConfigurationEntryArray5.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
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
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = parameters5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass4 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = provider10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass9 = appConfigurationEntryArray8.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass5 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass6 = appConfigurationEntryArray5.getClass();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass5 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = provider8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        java.lang.Class<?> wildcardClass5 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
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
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = provider11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = provider14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass9 = appConfigurationEntryArray8.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass10 = appConfigurationEntryArray9.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = parameters11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
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
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass7 = appConfigurationEntryArray6.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass13 = appConfigurationEntryArray12.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = parameters13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
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
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.security.Provider provider3 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        java.lang.Class<?> wildcardClass5 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider2 = configuration0.getProvider();
        java.security.Provider provider3 = configuration0.getProvider();
        java.lang.Class<?> wildcardClass4 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
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
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass2 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
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
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
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
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = parameters10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = provider9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass9 = appConfigurationEntryArray8.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
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
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
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
        java.lang.String str13 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
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
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = provider8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
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
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = parameters5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = provider8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
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
        java.lang.Class<?> wildcardClass14 = appConfigurationEntryArray13.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
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
        java.lang.Class<?> wildcardClass15 = appConfigurationEntryArray14.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
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
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
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
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = parameters4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
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
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = provider5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider5);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = provider9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = parameters11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
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
        java.lang.Class<?> wildcardClass13 = appConfigurationEntryArray12.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass8 = appConfigurationEntryArray7.getClass();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass5 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
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
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
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
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = provider11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        java.lang.String str2 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters3 = configuration0.getParameters();
        java.security.Provider provider4 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(provider4);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass9 = appConfigurationEntryArray8.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
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
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = parameters13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
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
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass10 = appConfigurationEntryArray9.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
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
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = parameters11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
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
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        configuration0.refresh();
        configuration0.refresh();
        java.lang.Class<?> wildcardClass4 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass5 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
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
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass9 = appConfigurationEntryArray8.getClass();
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass9 = appConfigurationEntryArray8.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
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
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = provider10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
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
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = parameters16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
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
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
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
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = parameters13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass9 = appConfigurationEntryArray8.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
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
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass15 = appConfigurationEntryArray14.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = parameters8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
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
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass10 = appConfigurationEntryArray9.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = parameters10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = parameters5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
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
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
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
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
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
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
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
        java.lang.String str12 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
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
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        java.lang.String str14 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass10 = appConfigurationEntryArray9.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider4 = configuration0.getProvider();
        java.lang.Class<?> wildcardClass5 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = provider11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass5 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.String str10 = kerberosUserConfiguration0.getType();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass9 = appConfigurationEntryArray8.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
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
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = parameters13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = provider7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.security.Provider provider1 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = parameters5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
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
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
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
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
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
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
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
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.String str11 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass7 = appConfigurationEntryArray6.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
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
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
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
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
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
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
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
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
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
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider5 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration0.refresh();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
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
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
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
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider14 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.lang.String str1 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration0.getProvider();
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration0.getType();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
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
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
}

