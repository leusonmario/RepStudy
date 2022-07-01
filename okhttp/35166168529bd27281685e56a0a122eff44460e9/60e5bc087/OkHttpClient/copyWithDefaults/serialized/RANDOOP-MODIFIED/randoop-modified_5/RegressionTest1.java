import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        java.util.List<java.lang.String> strList6 = okHttpClient5.transports;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        java.net.ResponseCache responseCache3 = okHttpClient2.getResponseCache();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.copyWithDefaults();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter7 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter7.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter7.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter7.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter7.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy12 = serializedObjectSupporter7.deserializeObjectProxy3();
        okHttpClient2.serializedObjectSupporter = serializedObjectSupporter7;
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = okHttpClient2.getHostnameVerifier();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = hostnameVerifier14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(responseCache3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(proxy12);
        org.junit.Assert.assertNull(hostnameVerifier14);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient43();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient220();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient9.copyWithDefaults();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient141();
        java.net.ResponseCache responseCache10 = okHttpClient9.responseCache;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(responseCache10);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient255();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient249();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient191();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient196();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient33();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient256();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket4 = socketFactory0.createSocket(inetAddress2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient191();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient256();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient23();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient210();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient204();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient10();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient12();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient84();
        okHttpClient13.followProtocolRedirects = false;
        java.net.Proxy proxy16 = okHttpClient13.proxy;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(proxy16);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy9();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient128();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient239();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient8.copyWithDefaults();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter6.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter6.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter6.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter6.deserializeObjectOkHttpClient189();
        okHttpClient5.serializedObjectSupporter = serializedObjectSupporter6;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter6.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter6.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter6.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter6.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter6.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = serializedObjectSupporter6.deserializeObjectOkHttpClient239();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient17);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        java.util.List<java.lang.String> strList6 = okHttpClient5.getDEFAULT_TRANSPORTS();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient186();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter6.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter6.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter6.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter6.deserializeObjectOkHttpClient189();
        okHttpClient5.serializedObjectSupporter = serializedObjectSupporter6;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter6.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter6.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter6.deserializeObjectOkHttpClient156();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter15 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter15.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = serializedObjectSupporter15.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient18 = serializedObjectSupporter15.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient19 = serializedObjectSupporter15.deserializeObjectOkHttpClient153();
        java.net.Proxy proxy20 = serializedObjectSupporter15.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient21 = serializedObjectSupporter15.deserializeObjectOkHttpClient194();
        com.squareup.okhttp.OkHttpClient okHttpClient22 = serializedObjectSupporter15.deserializeObjectOkHttpClient52();
        java.util.List<java.lang.String> strList23 = okHttpClient22.getDEFAULT_TRANSPORTS();
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient14.setTransports(strList23);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(proxy20);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(okHttpClient24);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy5();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy2();
        java.net.Proxy.Type type10 = proxy9.type();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter11 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter11.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter11.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter11.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter11.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy16 = serializedObjectSupporter11.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = serializedObjectSupporter11.deserializeObjectOkHttpClient257();
        java.net.Proxy proxy18 = serializedObjectSupporter11.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient19 = serializedObjectSupporter11.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient20 = serializedObjectSupporter11.deserializeObjectOkHttpClient202();
        com.squareup.okhttp.OkHttpClient okHttpClient21 = serializedObjectSupporter11.deserializeObjectOkHttpClient26();
        com.squareup.okhttp.OkHttpClient okHttpClient22 = serializedObjectSupporter11.deserializeObjectOkHttpClient238();
        boolean boolean23 = proxy9.equals((java.lang.Object) serializedObjectSupporter11);
        com.squareup.okhttp.OkHttpClient okHttpClient24 = serializedObjectSupporter11.deserializeObjectOkHttpClient148();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + java.net.Proxy.Type.HTTP + "'", type10.equals(java.net.Proxy.Type.HTTP));
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(proxy16);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(proxy18);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(okHttpClient24);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient191();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient196();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient5.copyWithDefaults();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient129();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient196();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter10 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter10.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter10.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter10.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter10.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter10.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter10.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = serializedObjectSupporter10.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient18 = serializedObjectSupporter10.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient19 = serializedObjectSupporter10.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter20 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient21 = serializedObjectSupporter20.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient22 = serializedObjectSupporter20.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient23 = serializedObjectSupporter20.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient24 = serializedObjectSupporter20.deserializeObjectOkHttpClient159();
        com.squareup.okhttp.OkHttpClient okHttpClient25 = serializedObjectSupporter20.deserializeObjectOkHttpClient116();
        com.squareup.okhttp.OkHttpClient okHttpClient26 = serializedObjectSupporter20.deserializeObjectOkHttpClient42();
        java.util.List<java.lang.String> strList27 = okHttpClient26.getDEFAULT_TRANSPORTS();
        okHttpClient19.transports = strList27;
        com.squareup.okhttp.OkHttpClient okHttpClient29 = okHttpClient9.setTransports(strList27);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient25);
        org.junit.Assert.assertNotNull(okHttpClient26);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(okHttpClient29);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient143();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient68();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket5 = socketFactory0.createSocket("DIRECT", (int) (short) 100, inetAddress3, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient52();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket3 = socketFactory0.createSocket("", 1);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient233();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient26();
        com.squareup.okhttp.OkAuthenticator okAuthenticator12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setAuthenticator(okAuthenticator12);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient172();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient91();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient250();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient191();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient256();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient23();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient148();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient33();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient232();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient192();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient127();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient201();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) (byte) -1, 100L);
        com.squareup.okhttp.Connection connection3 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectionPool2.recycle(connection3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient179();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) (short) 100, (-1L));
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient141();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient132();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient54();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = new com.squareup.okhttp.OkHttpClient(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient192();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient247();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient202();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient27();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient148();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient167();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient98();
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter6.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter6.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter6.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter10 = okHttpClient9.serializedObjectSupporter;
        com.squareup.okhttp.ConnectionPool connectionPool13 = new com.squareup.okhttp.ConnectionPool(100, (long) (byte) 100);
        int int14 = connectionPool13.getConnectionCount();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient9.setConnectionPool(connectionPool13);
        okHttpClient4.connectionPool = connectionPool13;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(okHttpClient15);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient137();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter6.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter6.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter6.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter6.deserializeObjectOkHttpClient189();
        okHttpClient5.serializedObjectSupporter = serializedObjectSupporter6;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter6.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter6.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter6.deserializeObjectOkHttpClient248();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter6.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter6.deserializeObjectOkHttpClient34();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient10();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient12();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient7();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient225();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient28();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient55();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient179();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient150();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient131();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.ConnectionPool connectionPool10 = okHttpClient9.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(connectionPool10);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient51();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient255();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        java.util.List<java.lang.String> strList10 = okHttpClient9.getDEFAULT_TRANSPORTS();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient202();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient191();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient48();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient150();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient213();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient192();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient5.copyWithDefaults();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient7();
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = okHttpClient6.hostnameVerifier;
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(hostnameVerifier7);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient232();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        java.net.Proxy proxy13 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient134();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(proxy13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient233();
        java.net.Proxy proxy11 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        java.net.Proxy proxy13 = serializedObjectSupporter0.deserializeObjectProxy10();
        java.lang.String str14 = proxy13.toString();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(proxy11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(proxy13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HTTP @ inesserver1.windows.cin.ufpe.br/172.20.26.2:42023" + "'", str14, "HTTP @ inesserver1.windows.cin.ufpe.br/172.20.26.2:42023");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) (short) 1, (long) (short) 0);
        int int3 = connectionPool2.getSpdyConnectionCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient167();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient173();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient126();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient7();
        com.squareup.okhttp.ConnectionPool connectionPool9 = new com.squareup.okhttp.ConnectionPool((int) ' ', (long) (byte) 0);
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setConnectionPool(connectionPool9);
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient10();
        com.squareup.okhttp.ConnectionPool connectionPool12 = new com.squareup.okhttp.ConnectionPool((int) (byte) 0, (long) ' ');
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient9.setConnectionPool(connectionPool12);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient213();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient192();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient134();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient207();
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        okHttpClient7.authenticator = okAuthenticator8;
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy5();
        java.net.SocketAddress socketAddress7 = proxy6.address();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter8 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter8.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter8.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter8.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter8.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter8.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter8.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter8.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter8.deserializeObjectOkHttpClient21();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = serializedObjectSupporter8.deserializeObjectOkHttpClient18();
        boolean boolean18 = proxy6.equals((java.lang.Object) serializedObjectSupporter8);
        com.squareup.okhttp.OkHttpClient okHttpClient19 = serializedObjectSupporter8.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient20 = serializedObjectSupporter8.deserializeObjectOkHttpClient180();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(socketAddress7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient20);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient210();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient48();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient128();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient148();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient161();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter6.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter6.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter6.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter6.deserializeObjectOkHttpClient189();
        okHttpClient5.serializedObjectSupporter = serializedObjectSupporter6;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter6.deserializeObjectOkHttpClient184();
        java.net.Proxy proxy13 = serializedObjectSupporter6.deserializeObjectProxy10();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(proxy13);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool(10, (long) (byte) 10);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient18();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) (short) 0, (long) 10);
        int int3 = connectionPool2.getConnectionCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient129();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient196();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        java.net.Proxy proxy11 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient49();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient25();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(proxy11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient204();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient245();
        java.util.List<java.lang.String> strList8 = okHttpClient7.getDEFAULT_TRANSPORTS();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient129();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy4();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient33();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter7 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter7.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter7.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter7.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter7.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter7.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter7.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter7.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter7.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter7.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter17 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient18 = serializedObjectSupporter17.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient19 = serializedObjectSupporter17.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient20 = serializedObjectSupporter17.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient21 = serializedObjectSupporter17.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient22 = serializedObjectSupporter17.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient23 = serializedObjectSupporter17.deserializeObjectOkHttpClient59();
        java.net.ProxySelector proxySelector24 = java.net.ProxySelector.getDefault();
        okHttpClient23.proxySelector = proxySelector24;
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient16.setProxySelector(proxySelector24);
        okHttpClient6.proxySelector = proxySelector24;
        java.net.URI uRI28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.net.Proxy> proxyList29 = proxySelector24.select(uRI28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URI can't be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(proxySelector24);
        org.junit.Assert.assertNotNull(okHttpClient26);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient26();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient57();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient143();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient191();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient62();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient7();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient44();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient51();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = okHttpClient2.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(sSLSocketFactory3);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient21();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient18();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter6.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter6.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter6.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter6.deserializeObjectOkHttpClient189();
        okHttpClient5.serializedObjectSupporter = serializedObjectSupporter6;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter6.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter6.deserializeObjectOkHttpClient166();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient255();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient255();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy4();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy10();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient99();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient110();
        java.net.CookieHandler cookieHandler7 = null;
        okHttpClient6.cookieHandler = cookieHandler7;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
        java.util.Set<com.squareup.okhttp.Route> routeSet8 = okHttpClient7.failedRoutes;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(routeSet8);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient3();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient128();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient253();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient134();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient107();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient207();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient133();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) (byte) -1, (long) (short) 1);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) ' ', (long) '4');
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient179();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient167();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient232();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        java.util.List<java.lang.String> strList13 = okHttpClient12.getDEFAULT_TRANSPORTS();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient206();
        java.util.List<java.lang.String> strList8 = okHttpClient7.getTransports();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(strList8);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient248();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient247();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient21();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter9 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter9.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter9.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter9.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter9.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter9.deserializeObjectOkHttpClient203();
        java.net.ProxySelector proxySelector15 = java.net.ProxySelector.getDefault();
        okHttpClient14.proxySelector = proxySelector15;
        java.net.ProxySelector.setDefault(proxySelector15);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient8.setProxySelector(proxySelector15);
        java.net.ProxySelector.setDefault(proxySelector15);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(proxySelector15);
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) '4', (long) (byte) 10);
        int int3 = connectionPool2.getHttpConnectionCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient247();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient140();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient96();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient249();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient131();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections6 = serializedObjectSupporter0.deserializeObjectList1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        java.net.ProxySelector proxySelector0 = java.net.ProxySelector.getDefault();
        java.net.ProxySelector.setDefault(proxySelector0);
        org.junit.Assert.assertNotNull(proxySelector0);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient206();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient92();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient239();
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient10.hostnameVerifier;
        com.squareup.okhttp.OkAuthenticator okAuthenticator12 = okHttpClient10.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
        org.junit.Assert.assertNull(okAuthenticator12);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient107();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient44();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient191();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient140();
        java.net.CookieHandler cookieHandler9 = okHttpClient8.cookieHandler;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(cookieHandler9);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient232();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        javax.net.ssl.HostnameVerifier hostnameVerifier13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setHostnameVerifier(hostnameVerifier13);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient119();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient178();
        java.net.Proxy proxy10 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient206();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient207();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient13.copyWithDefaults();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        boolean boolean5 = okHttpClient4.followProtocolRedirects;
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setResponseCache(responseCache6);
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient248();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient176();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient126();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient9();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient36();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        java.net.Proxy proxy11 = serializedObjectSupporter0.deserializeObjectProxy2();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(proxy11);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient129();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient196();
        java.net.CookieHandler cookieHandler10 = okHttpClient9.cookieHandler;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(cookieHandler10);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient168();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient96();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient132();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient180();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient168();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient170();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient213();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient210();
        java.net.ProxySelector proxySelector8 = okHttpClient7.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) (byte) -1, (long) (short) -1);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient12();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient253();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient207();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient150();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient105();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient192();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient206();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient241();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        okHttpClient10.sslSocketFactory = sSLSocketFactory11;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient168();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient158();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient133();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        okHttpClient7.sslSocketFactory = sSLSocketFactory8;
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient206();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient25();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        java.net.ResponseCache responseCache10 = okHttpClient9.responseCache;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(responseCache10);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient209();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setFollowProtocolRedirects(false);
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.InetAddress inetAddress1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket3 = socketFactory0.createSocket(inetAddress1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = okHttpClient3.authenticator;
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(okAuthenticator4);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient7();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient44();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient258();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient204();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient245();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient230();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient226();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient53();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient235();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient133();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient247();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient252();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy9();
        java.net.Proxy proxy10 = serializedObjectSupporter0.deserializeObjectProxy9();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient13();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient210();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient143();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient113();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient28();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient56();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient84();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient204();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient21();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        java.net.Proxy proxy10 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient107();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient202();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient27();
        java.net.Proxy proxy10 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient226();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient10();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient12();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient168();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter0.deserializeObjectOkHttpClient168();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) (short) 1, 1L);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool(100, (long) (-1));
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient258();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient152();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient168();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter7 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter7.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter7.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter7.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter7.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter7.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter7.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter7.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter7.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter7.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = serializedObjectSupporter7.deserializeObjectOkHttpClient236();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory18 = okHttpClient17.getSslSocketFactory();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter19 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy20 = serializedObjectSupporter19.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient21 = serializedObjectSupporter19.deserializeObjectOkHttpClient135();
        java.net.ResponseCache responseCache22 = okHttpClient21.getResponseCache();
        java.net.ProxySelector proxySelector23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient21.setProxySelector(proxySelector23);
        java.net.CookieHandler cookieHandler25 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient21.setCookieHandler(cookieHandler25);
        java.net.ProxySelector proxySelector27 = java.net.ProxySelector.getDefault();
        okHttpClient21.proxySelector = proxySelector27;
        okHttpClient17.proxySelector = proxySelector27;
        com.squareup.okhttp.OkHttpClient okHttpClient30 = okHttpClient6.setProxySelector(proxySelector27);
        java.net.URI uRI31 = null;
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter32 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient33 = serializedObjectSupporter32.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient34 = serializedObjectSupporter32.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient35 = serializedObjectSupporter32.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient36 = serializedObjectSupporter32.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy37 = serializedObjectSupporter32.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient38 = serializedObjectSupporter32.deserializeObjectOkHttpClient257();
        java.net.Proxy proxy39 = serializedObjectSupporter32.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient40 = serializedObjectSupporter32.deserializeObjectOkHttpClient169();
        com.squareup.okhttp.OkHttpClient okHttpClient41 = serializedObjectSupporter32.deserializeObjectOkHttpClient178();
        java.net.Proxy proxy42 = serializedObjectSupporter32.deserializeObjectProxy3();
        java.net.Proxy.Type type43 = proxy42.type();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter44 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient45 = serializedObjectSupporter44.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient46 = serializedObjectSupporter44.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient47 = serializedObjectSupporter44.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient48 = serializedObjectSupporter44.deserializeObjectOkHttpClient261();
        com.squareup.okhttp.OkHttpClient okHttpClient49 = serializedObjectSupporter44.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient50 = serializedObjectSupporter44.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient51 = serializedObjectSupporter44.deserializeObjectOkHttpClient247();
        com.squareup.okhttp.OkHttpClient okHttpClient52 = serializedObjectSupporter44.deserializeObjectOkHttpClient252();
        java.net.Proxy proxy53 = serializedObjectSupporter44.deserializeObjectProxy9();
        java.net.SocketAddress socketAddress54 = proxy53.address();
        java.net.Proxy proxy55 = new java.net.Proxy(type43, socketAddress54);
        java.io.IOException iOException56 = null;
        // The following exception was thrown during execution in test generation
        try {
            proxySelector27.connectFailed(uRI31, socketAddress54, iOException56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arguments can't be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(sSLSocketFactory18);
        org.junit.Assert.assertNotNull(proxy20);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNull(responseCache22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient26);
        org.junit.Assert.assertNotNull(proxySelector27);
        org.junit.Assert.assertNotNull(okHttpClient30);
        org.junit.Assert.assertNotNull(okHttpClient33);
        org.junit.Assert.assertNotNull(okHttpClient34);
        org.junit.Assert.assertNotNull(okHttpClient35);
        org.junit.Assert.assertNotNull(okHttpClient36);
        org.junit.Assert.assertNotNull(proxy37);
        org.junit.Assert.assertNotNull(okHttpClient38);
        org.junit.Assert.assertNotNull(proxy39);
        org.junit.Assert.assertNotNull(okHttpClient40);
        org.junit.Assert.assertNotNull(okHttpClient41);
        org.junit.Assert.assertNotNull(proxy42);
        org.junit.Assert.assertTrue("'" + type43 + "' != '" + java.net.Proxy.Type.HTTP + "'", type43.equals(java.net.Proxy.Type.HTTP));
        org.junit.Assert.assertNotNull(okHttpClient45);
        org.junit.Assert.assertNotNull(okHttpClient46);
        org.junit.Assert.assertNotNull(okHttpClient47);
        org.junit.Assert.assertNotNull(okHttpClient48);
        org.junit.Assert.assertNotNull(okHttpClient49);
        org.junit.Assert.assertNotNull(okHttpClient50);
        org.junit.Assert.assertNotNull(okHttpClient51);
        org.junit.Assert.assertNotNull(okHttpClient52);
        org.junit.Assert.assertNotNull(proxy53);
        org.junit.Assert.assertNotNull(socketAddress54);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient49();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient2.copyWithDefaults();
        javax.net.ssl.HostnameVerifier hostnameVerifier4 = okHttpClient2.hostnameVerifier;
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(hostnameVerifier4);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) (short) 100, 100L);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient213();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient192();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient134();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient207();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = okHttpClient7.sslSocketFactory;
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(sSLSocketFactory8);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient51();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient255();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient99();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient71();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient51();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient255();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient99();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient247();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient252();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy9();
        java.net.Proxy proxy10 = serializedObjectSupporter0.deserializeObjectProxy9();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient242();
        boolean boolean12 = okHttpClient11.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient258();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient67();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient180();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient168();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient42();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient180();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient168();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient49();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient146();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient178();
        java.net.Proxy proxy10 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient206();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient207();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient134();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient206();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient132();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient126();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient12();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient140();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient180();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient10();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient55();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient6.copyWithDefaults();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient10();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient12();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient225();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool(100, (long) (byte) 100);
        connectionPool2.evictAll();
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy5();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient245();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient213();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient192();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient134();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient111();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient204();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient42();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient172();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient10.copyWithDefaults();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient7();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient44();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient128();
        okHttpClient5.followProtocolRedirects = true;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient191();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient256();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient23();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient8.copyWithDefaults();
        java.util.Set<com.squareup.okhttp.Route> routeSet10 = okHttpClient9.failedRoutes;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(routeSet10);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient99();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient225();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient137();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient133();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy9();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient213();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient227();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy3();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(proxy3);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) '4', 10L);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient10();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = new com.squareup.okhttp.OkHttpClient(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient172();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient176();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient204();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient245();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = okHttpClient7.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(sSLSocketFactory8);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient192();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient92();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient226();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient201();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter6.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter6.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter6.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter6.deserializeObjectOkHttpClient189();
        okHttpClient5.serializedObjectSupporter = serializedObjectSupporter6;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter6.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter6.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter6.deserializeObjectOkHttpClient138();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter6.deserializeObjectOkHttpClient141();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter6.deserializeObjectOkHttpClient183();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient201();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient239();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient192();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient150();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient131();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient233();
        java.net.Proxy proxy11 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient232();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(proxy11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient143();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter8 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter8.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter8.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter8.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter8.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy13 = serializedObjectSupporter8.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter8.deserializeObjectOkHttpClient257();
        java.net.Proxy proxy15 = serializedObjectSupporter8.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter8.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = serializedObjectSupporter8.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient18 = serializedObjectSupporter8.deserializeObjectOkHttpClient86();
        com.squareup.okhttp.ConnectionPool connectionPool21 = new com.squareup.okhttp.ConnectionPool((int) (byte) 10, (long) 0);
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient18.setConnectionPool(connectionPool21);
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter23 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient24 = serializedObjectSupporter23.deserializeObjectOkHttpClient12();
        java.net.Proxy proxy25 = serializedObjectSupporter23.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient18.setProxy(proxy25);
        okHttpClient7.proxy = proxy25;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(proxy13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(proxy15);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(proxy25);
        org.junit.Assert.assertNotNull(okHttpClient26);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient137();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient105();
        java.util.Set<com.squareup.okhttp.Route> routeSet9 = okHttpClient8.getfailedRoutes();
        boolean boolean10 = okHttpClient8.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(routeSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient248();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient176();
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = okHttpClient8.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(okAuthenticator9);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter4 = okHttpClient3.serializedObjectSupporter;
        okHttpClient3.followProtocolRedirects = true;
        com.squareup.okhttp.ConnectionPool connectionPool9 = new com.squareup.okhttp.ConnectionPool(100, (long) (byte) 0);
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient3.setConnectionPool(connectionPool9);
        com.squareup.okhttp.Connection connection11 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectionPool9.recycle(connection11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(serializedObjectSupporter4);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient129();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient196();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient12();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient39();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient233();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient131();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient252();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient202();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient204();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient166();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient137();
        boolean boolean6 = okHttpClient5.followProtocolRedirects;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient178();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        java.net.Proxy proxy11 = serializedObjectSupporter0.deserializeObjectProxy2();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(proxy11);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) '4', (long) 10);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient180();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient168();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient126();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient7();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient150();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient222();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient202();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient137();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient202();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient27();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient148();
        java.net.Proxy proxy11 = serializedObjectSupporter0.deserializeObjectProxy4();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(proxy11);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient12();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient67();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient192();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient247();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient239();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient179();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient210();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient168();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy4();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient178();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient21();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient18();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = okHttpClient10.authenticator;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(okAuthenticator11);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient132();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient180();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient137();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient137();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient143();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient235();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient256();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient180();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient23();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient235();
        java.net.ResponseCache responseCache10 = okHttpClient9.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(responseCache10);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient129();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient174();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient152();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient207();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient157();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient126();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        okHttpClient6.sslSocketFactory = sSLSocketFactory7;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient243();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient137();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient133();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket4 = socketFactory0.createSocket(inetAddress2, 0);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient140();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient209();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient243();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient105();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient10.copyWithDefaults();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient249();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient151();
        java.net.Proxy proxy12 = okHttpClient11.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(proxy12);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient23();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient209();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) (byte) 1, (long) 1);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy8();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) (short) 1, (long) (-1));
        connectionPool2.evictAll();
        int int4 = connectionPool2.getHttpConnectionCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient242();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient141();
        java.util.List<java.lang.String> strList7 = okHttpClient6.getTransports();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress2 = null;
        java.net.InetAddress inetAddress4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket6 = socketFactory0.createSocket(inetAddress2, (int) '#', inetAddress4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        java.net.Proxy proxy11 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient105();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(proxy11);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter6.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter6.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter6.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter6.deserializeObjectOkHttpClient189();
        okHttpClient5.serializedObjectSupporter = serializedObjectSupporter6;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter6.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter6.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter6.deserializeObjectOkHttpClient138();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter6.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter16 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy17 = serializedObjectSupporter16.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient18 = serializedObjectSupporter16.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient19 = serializedObjectSupporter16.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient20 = serializedObjectSupporter16.deserializeObjectOkHttpClient192();
        com.squareup.okhttp.OkHttpClient okHttpClient21 = serializedObjectSupporter16.deserializeObjectOkHttpClient127();
        com.squareup.okhttp.ConnectionPool connectionPool24 = new com.squareup.okhttp.ConnectionPool((int) (byte) -1, (long) (byte) 0);
        int int25 = connectionPool24.getConnectionCount();
        okHttpClient21.connectionPool = connectionPool24;
        com.squareup.okhttp.OkHttpClient okHttpClient27 = okHttpClient15.setConnectionPool(connectionPool24);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(proxy17);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(okHttpClient27);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient167();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.ConnectionPool connectionPool9 = okHttpClient8.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(connectionPool9);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient56();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient232();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient233();
        java.net.Proxy proxy11 = serializedObjectSupporter0.deserializeObjectProxy4();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections12 = serializedObjectSupporter0.deserializeObjectSet1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$SynchronizedSet cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(proxy11);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient180();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient168();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient233();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        okHttpClient7.sslSocketFactory = sSLSocketFactory8;
        java.util.List<java.lang.String> strList10 = okHttpClient7.getTransports();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(strList10);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        java.util.List<java.lang.String> strList6 = okHttpClient5.getTransports();
        java.util.List<java.lang.String> strList7 = okHttpClient5.getDEFAULT_TRANSPORTS();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient147();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient10();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient12();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient168();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter0.deserializeObjectOkHttpClient176();
        java.util.Set<com.squareup.okhttp.Route> routeSet16 = okHttpClient15.getfailedRoutes();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(routeSet16);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy2();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(proxy8);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient141();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient204();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient148();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient213();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient170();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy5();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient88();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient107();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient67();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient239();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient150();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient256();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        java.net.ResponseCache responseCache10 = okHttpClient9.responseCache;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(responseCache10);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient167();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient173();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        java.net.Proxy proxy11 = serializedObjectSupporter0.deserializeObjectProxy2();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(proxy11);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient137();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient133();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy10();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(proxy8);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient178();
        java.net.Proxy proxy10 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient206();
        java.net.Proxy proxy12 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient127();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(proxy12);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient167();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient205();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient53();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient202();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient204();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient244();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient90();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient204();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient160();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient160();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy12 = serializedObjectSupporter0.deserializeObjectProxy3();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(proxy12);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        java.net.Proxy proxy2 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(proxy2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient150();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient256();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter10 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy11 = serializedObjectSupporter10.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter10.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter10.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter10.deserializeObjectOkHttpClient192();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter10.deserializeObjectOkHttpClient247();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter16 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy17 = serializedObjectSupporter16.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient18 = serializedObjectSupporter16.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient19 = serializedObjectSupporter16.deserializeObjectOkHttpClient213();
        com.squareup.okhttp.OkHttpClient okHttpClient20 = serializedObjectSupporter16.deserializeObjectOkHttpClient192();
        com.squareup.okhttp.OkHttpClient okHttpClient21 = serializedObjectSupporter16.deserializeObjectOkHttpClient134();
        java.net.Proxy proxy22 = serializedObjectSupporter16.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient15.setProxy(proxy22);
        okHttpClient9.proxy = proxy22;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(proxy11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(proxy17);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(proxy22);
        org.junit.Assert.assertNotNull(okHttpClient23);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient216();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient206();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient132();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient121();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient9();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient36();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient170();
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = okHttpClient10.authenticator;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(okAuthenticator11);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient258();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient9();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient150();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient222();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient121();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient92();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient54();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient49();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = null;
        okHttpClient9.sslSocketFactory = sSLSocketFactory10;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient204();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient160();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient160();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient188();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient248();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient176();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient126();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient191();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient7();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient44();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient244();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient249();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket6 = socketFactory0.createSocket("hi!", (int) (short) 1, inetAddress4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient48();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient62();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        javax.net.ssl.HostnameVerifier hostnameVerifier2 = okHttpClient1.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNull(hostnameVerifier2);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient59();
        java.net.ProxySelector proxySelector7 = java.net.ProxySelector.getDefault();
        okHttpClient6.proxySelector = proxySelector7;
        java.net.URI uRI9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.net.Proxy> proxyList10 = proxySelector7.select(uRI9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URI can't be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxySelector7);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.InetAddress inetAddress1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket3 = socketFactory0.createSocket(inetAddress1, 0);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient107();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient207();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient112();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient243();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter12 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter12.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter12.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter12.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter12.deserializeObjectOkHttpClient153();
        java.net.Proxy proxy17 = serializedObjectSupporter12.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient18 = serializedObjectSupporter12.deserializeObjectOkHttpClient194();
        com.squareup.okhttp.OkHttpClient okHttpClient19 = serializedObjectSupporter12.deserializeObjectOkHttpClient52();
        java.util.List<java.lang.String> strList20 = okHttpClient19.getDEFAULT_TRANSPORTS();
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient11.setTransports(strList20);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(proxy17);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(okHttpClient21);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter6.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter6.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter6.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter6.deserializeObjectOkHttpClient189();
        okHttpClient5.serializedObjectSupporter = serializedObjectSupporter6;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter6.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter6.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter6.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter6.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter6.deserializeObjectOkHttpClient254();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient191();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient62();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient204();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient36();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient150();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient222();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient202();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter6.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter6.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter6.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter6.deserializeObjectOkHttpClient189();
        okHttpClient5.serializedObjectSupporter = serializedObjectSupporter6;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter6.deserializeObjectOkHttpClient184();
        java.net.Proxy proxy13 = serializedObjectSupporter6.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter6.deserializeObjectOkHttpClient232();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter6.deserializeObjectOkHttpClient200();
        java.net.Proxy proxy16 = serializedObjectSupporter6.deserializeObjectProxy8();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(proxy13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(proxy16);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) '#', (long) '4');
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter6.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter6.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter6.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter6.deserializeObjectOkHttpClient189();
        okHttpClient5.serializedObjectSupporter = serializedObjectSupporter6;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter6.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter6.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter6.deserializeObjectOkHttpClient227();
        java.net.Proxy proxy15 = serializedObjectSupporter6.deserializeObjectProxy4();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(proxy15);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool(0, (long) (-1));
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient157();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient228();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient213();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient192();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient134();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient110();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient140();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient209();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient243();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient105();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient36();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient164();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient99();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient192();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient150();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient137();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient160();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient50();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient110();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient233();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient179();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient167();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient129();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient168();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter7 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter7.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter7.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter7.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter7.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter7.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter7.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter7.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter7.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter7.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = serializedObjectSupporter7.deserializeObjectOkHttpClient236();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory18 = okHttpClient17.getSslSocketFactory();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter19 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy20 = serializedObjectSupporter19.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient21 = serializedObjectSupporter19.deserializeObjectOkHttpClient135();
        java.net.ResponseCache responseCache22 = okHttpClient21.getResponseCache();
        java.net.ProxySelector proxySelector23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient21.setProxySelector(proxySelector23);
        java.net.CookieHandler cookieHandler25 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient21.setCookieHandler(cookieHandler25);
        java.net.ProxySelector proxySelector27 = java.net.ProxySelector.getDefault();
        okHttpClient21.proxySelector = proxySelector27;
        okHttpClient17.proxySelector = proxySelector27;
        com.squareup.okhttp.OkHttpClient okHttpClient30 = okHttpClient6.setProxySelector(proxySelector27);
        java.net.URI uRI31 = null;
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter32 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient33 = serializedObjectSupporter32.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient34 = serializedObjectSupporter32.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient35 = serializedObjectSupporter32.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient36 = serializedObjectSupporter32.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient37 = serializedObjectSupporter32.deserializeObjectOkHttpClient163();
        java.net.Proxy proxy38 = serializedObjectSupporter32.deserializeObjectProxy5();
        java.net.SocketAddress socketAddress39 = proxy38.address();
        java.io.IOException iOException40 = null;
        // The following exception was thrown during execution in test generation
        try {
            proxySelector27.connectFailed(uRI31, socketAddress39, iOException40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arguments can't be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(sSLSocketFactory18);
        org.junit.Assert.assertNotNull(proxy20);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNull(responseCache22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient26);
        org.junit.Assert.assertNotNull(proxySelector27);
        org.junit.Assert.assertNotNull(okHttpClient30);
        org.junit.Assert.assertNotNull(okHttpClient33);
        org.junit.Assert.assertNotNull(okHttpClient34);
        org.junit.Assert.assertNotNull(okHttpClient35);
        org.junit.Assert.assertNotNull(okHttpClient36);
        org.junit.Assert.assertNotNull(okHttpClient37);
        org.junit.Assert.assertNotNull(proxy38);
        org.junit.Assert.assertNotNull(socketAddress39);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.InetAddress inetAddress1 = null;
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket5 = socketFactory0.createSocket(inetAddress1, (int) (short) 10, inetAddress3, 10);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient21();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter9 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter9.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter9.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter9.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter9.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter9.deserializeObjectOkHttpClient203();
        java.net.ProxySelector proxySelector15 = java.net.ProxySelector.getDefault();
        okHttpClient14.proxySelector = proxySelector15;
        java.net.ProxySelector.setDefault(proxySelector15);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient8.setProxySelector(proxySelector15);
        java.net.URI uRI19 = null;
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter20 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient21 = serializedObjectSupporter20.deserializeObjectOkHttpClient20();
        com.squareup.okhttp.OkHttpClient okHttpClient22 = serializedObjectSupporter20.deserializeObjectOkHttpClient129();
        java.net.Proxy proxy23 = serializedObjectSupporter20.deserializeObjectProxy4();
        java.net.Proxy proxy24 = serializedObjectSupporter20.deserializeObjectProxy7();
        java.net.Proxy.Type type25 = proxy24.type();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter26 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient27 = serializedObjectSupporter26.deserializeObjectOkHttpClient259();
        com.squareup.okhttp.OkHttpClient okHttpClient28 = serializedObjectSupporter26.deserializeObjectOkHttpClient86();
        com.squareup.okhttp.OkHttpClient okHttpClient29 = serializedObjectSupporter26.deserializeObjectOkHttpClient139();
        java.net.Proxy proxy30 = serializedObjectSupporter26.deserializeObjectProxy7();
        java.net.SocketAddress socketAddress31 = proxy30.address();
        java.net.Proxy proxy32 = new java.net.Proxy(type25, socketAddress31);
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter33 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient34 = serializedObjectSupporter33.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient35 = serializedObjectSupporter33.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient36 = serializedObjectSupporter33.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient37 = serializedObjectSupporter33.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient38 = serializedObjectSupporter33.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient39 = serializedObjectSupporter33.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient40 = serializedObjectSupporter33.deserializeObjectOkHttpClient47();
        java.net.Proxy proxy41 = serializedObjectSupporter33.deserializeObjectProxy5();
        java.net.Proxy proxy42 = serializedObjectSupporter33.deserializeObjectProxy2();
        java.net.Proxy.Type type43 = proxy42.type();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter44 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient45 = serializedObjectSupporter44.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient46 = serializedObjectSupporter44.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient47 = serializedObjectSupporter44.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient48 = serializedObjectSupporter44.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient49 = serializedObjectSupporter44.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient50 = serializedObjectSupporter44.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient51 = serializedObjectSupporter44.deserializeObjectOkHttpClient47();
        java.net.Proxy proxy52 = serializedObjectSupporter44.deserializeObjectProxy5();
        java.net.Proxy proxy53 = serializedObjectSupporter44.deserializeObjectProxy2();
        java.net.Proxy.Type type54 = proxy53.type();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter55 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient56 = serializedObjectSupporter55.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient57 = serializedObjectSupporter55.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient58 = serializedObjectSupporter55.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient59 = serializedObjectSupporter55.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient60 = serializedObjectSupporter55.deserializeObjectOkHttpClient163();
        java.net.Proxy proxy61 = serializedObjectSupporter55.deserializeObjectProxy5();
        java.net.SocketAddress socketAddress62 = proxy61.address();
        java.net.Proxy proxy63 = new java.net.Proxy(type54, socketAddress62);
        java.net.Proxy proxy64 = new java.net.Proxy(type43, socketAddress62);
        java.net.Proxy proxy65 = new java.net.Proxy(type25, socketAddress62);
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter66 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient67 = serializedObjectSupporter66.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient68 = serializedObjectSupporter66.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient69 = serializedObjectSupporter66.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient70 = serializedObjectSupporter66.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient71 = serializedObjectSupporter66.deserializeObjectOkHttpClient163();
        java.net.Proxy proxy72 = serializedObjectSupporter66.deserializeObjectProxy5();
        java.net.SocketAddress socketAddress73 = proxy72.address();
        java.net.Proxy proxy74 = new java.net.Proxy(type25, socketAddress73);
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter75 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient76 = serializedObjectSupporter75.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient77 = serializedObjectSupporter75.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient78 = serializedObjectSupporter75.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient79 = serializedObjectSupporter75.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient80 = serializedObjectSupporter75.deserializeObjectOkHttpClient163();
        java.net.Proxy proxy81 = serializedObjectSupporter75.deserializeObjectProxy5();
        java.net.SocketAddress socketAddress82 = proxy81.address();
        java.net.Proxy proxy83 = new java.net.Proxy(type25, socketAddress82);
        java.io.IOException iOException84 = null;
        // The following exception was thrown during execution in test generation
        try {
            proxySelector15.connectFailed(uRI19, socketAddress82, iOException84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arguments can't be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(proxySelector15);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(proxy23);
        org.junit.Assert.assertNotNull(proxy24);
        org.junit.Assert.assertTrue("'" + type25 + "' != '" + java.net.Proxy.Type.HTTP + "'", type25.equals(java.net.Proxy.Type.HTTP));
        org.junit.Assert.assertNotNull(okHttpClient27);
        org.junit.Assert.assertNotNull(okHttpClient28);
        org.junit.Assert.assertNotNull(okHttpClient29);
        org.junit.Assert.assertNotNull(proxy30);
        org.junit.Assert.assertNotNull(socketAddress31);
        org.junit.Assert.assertNotNull(okHttpClient34);
        org.junit.Assert.assertNotNull(okHttpClient35);
        org.junit.Assert.assertNotNull(okHttpClient36);
        org.junit.Assert.assertNotNull(okHttpClient37);
        org.junit.Assert.assertNotNull(okHttpClient38);
        org.junit.Assert.assertNotNull(okHttpClient39);
        org.junit.Assert.assertNotNull(okHttpClient40);
        org.junit.Assert.assertNotNull(proxy41);
        org.junit.Assert.assertNotNull(proxy42);
        org.junit.Assert.assertTrue("'" + type43 + "' != '" + java.net.Proxy.Type.HTTP + "'", type43.equals(java.net.Proxy.Type.HTTP));
        org.junit.Assert.assertNotNull(okHttpClient45);
        org.junit.Assert.assertNotNull(okHttpClient46);
        org.junit.Assert.assertNotNull(okHttpClient47);
        org.junit.Assert.assertNotNull(okHttpClient48);
        org.junit.Assert.assertNotNull(okHttpClient49);
        org.junit.Assert.assertNotNull(okHttpClient50);
        org.junit.Assert.assertNotNull(okHttpClient51);
        org.junit.Assert.assertNotNull(proxy52);
        org.junit.Assert.assertNotNull(proxy53);
        org.junit.Assert.assertTrue("'" + type54 + "' != '" + java.net.Proxy.Type.HTTP + "'", type54.equals(java.net.Proxy.Type.HTTP));
        org.junit.Assert.assertNotNull(okHttpClient56);
        org.junit.Assert.assertNotNull(okHttpClient57);
        org.junit.Assert.assertNotNull(okHttpClient58);
        org.junit.Assert.assertNotNull(okHttpClient59);
        org.junit.Assert.assertNotNull(okHttpClient60);
        org.junit.Assert.assertNotNull(proxy61);
        org.junit.Assert.assertNotNull(socketAddress62);
        org.junit.Assert.assertNotNull(okHttpClient67);
        org.junit.Assert.assertNotNull(okHttpClient68);
        org.junit.Assert.assertNotNull(okHttpClient69);
        org.junit.Assert.assertNotNull(okHttpClient70);
        org.junit.Assert.assertNotNull(okHttpClient71);
        org.junit.Assert.assertNotNull(proxy72);
        org.junit.Assert.assertNotNull(socketAddress73);
        org.junit.Assert.assertNotNull(okHttpClient76);
        org.junit.Assert.assertNotNull(okHttpClient77);
        org.junit.Assert.assertNotNull(okHttpClient78);
        org.junit.Assert.assertNotNull(okHttpClient79);
        org.junit.Assert.assertNotNull(okHttpClient80);
        org.junit.Assert.assertNotNull(proxy81);
        org.junit.Assert.assertNotNull(socketAddress82);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient191();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient256();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient23();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient148();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient161();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient150();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient50();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient134();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient247();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient140();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient210();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient245();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient156();
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        okHttpClient9.authenticator = okAuthenticator10;
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient179();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
        java.lang.Class<?> wildcardClass8 = okHttpClient7.getClass();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter6.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter6.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter6.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter6.deserializeObjectOkHttpClient189();
        okHttpClient5.serializedObjectSupporter = serializedObjectSupporter6;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter6.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter6.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter6.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter6.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter6.deserializeObjectOkHttpClient71();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient255();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient242();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient117();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient179();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient129();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient90();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient140();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient248();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setCookieHandler(cookieHandler8);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient137();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient105();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        java.net.Proxy proxy11 = serializedObjectSupporter0.deserializeObjectProxy6();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(proxy11);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) (short) -1, 1L);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient248();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient176();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient50();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) 'a', 10L);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient248();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        java.net.ProxySelector proxySelector0 = java.net.ProxySelector.getDefault();
        java.net.URI uRI1 = null;
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter2 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter2.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter2.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter2.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter2.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter2.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter2.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter2.deserializeObjectOkHttpClient47();
        java.net.Proxy proxy10 = serializedObjectSupporter2.deserializeObjectProxy5();
        java.net.Proxy proxy11 = serializedObjectSupporter2.deserializeObjectProxy2();
        java.net.Proxy.Type type12 = proxy11.type();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter13 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter13.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter13.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter13.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = serializedObjectSupporter13.deserializeObjectOkHttpClient261();
        com.squareup.okhttp.OkHttpClient okHttpClient18 = serializedObjectSupporter13.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient19 = serializedObjectSupporter13.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient20 = serializedObjectSupporter13.deserializeObjectOkHttpClient247();
        com.squareup.okhttp.OkHttpClient okHttpClient21 = serializedObjectSupporter13.deserializeObjectOkHttpClient252();
        java.net.Proxy proxy22 = serializedObjectSupporter13.deserializeObjectProxy9();
        java.net.SocketAddress socketAddress23 = proxy22.address();
        java.net.Proxy proxy24 = new java.net.Proxy(type12, socketAddress23);
        java.io.IOException iOException25 = null;
        // The following exception was thrown during execution in test generation
        try {
            proxySelector0.connectFailed(uRI1, socketAddress23, iOException25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arguments can't be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(proxySelector0);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNotNull(proxy11);
        org.junit.Assert.assertTrue("'" + type12 + "' != '" + java.net.Proxy.Type.HTTP + "'", type12.equals(java.net.Proxy.Type.HTTP));
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(proxy22);
        org.junit.Assert.assertNotNull(socketAddress23);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient28();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket4 = socketFactory0.createSocket("", 100);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient160();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient188();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient242();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter6.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter6.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter6.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter6.deserializeObjectOkHttpClient189();
        okHttpClient5.serializedObjectSupporter = serializedObjectSupporter6;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter6.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter6.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter6.deserializeObjectOkHttpClient248();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter6.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter6.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = serializedObjectSupporter6.deserializeObjectOkHttpClient206();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient17);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        okHttpClient8.followProtocolRedirects = true;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient92();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = okHttpClient9.hostnameVerifier;
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient9.setAuthenticator(okAuthenticator11);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(hostnameVerifier10);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient143();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient260();
        com.squareup.okhttp.ConnectionPool connectionPool9 = okHttpClient8.connectionPool;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(connectionPool9);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient137();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        java.net.ProxySelector proxySelector7 = okHttpClient6.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxySelector7);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient25();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient90();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient107();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient44();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient51();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient233();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient48();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setCookieHandler(cookieHandler8);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient121();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient53();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = okHttpClient6.sslSocketFactory;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(sSLSocketFactory7);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient179();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient91();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient147();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient250();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        java.net.ResponseCache responseCache3 = okHttpClient2.getResponseCache();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setCookieHandler(cookieHandler6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient2.authenticator;
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(responseCache3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(okAuthenticator8);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient225();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient4.copyWithDefaults();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient179();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient167();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient129();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        java.net.ResponseCache responseCache9 = null;
        okHttpClient8.responseCache = responseCache9;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient53();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient233();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy10();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy9);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) ' ', (long) (short) 1);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient12();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient128();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) (short) 0, 0L);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient210();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient143();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient113();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient28();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient58();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient164();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter8 = okHttpClient7.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient21();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient18();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = okHttpClient9.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(sSLSocketFactory10);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient206();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient25();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient150();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        java.net.ResponseCache responseCache12 = okHttpClient11.responseCache;
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setResponseCache(responseCache13);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(responseCache12);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient53();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient39();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient192();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient48();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient26();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient68();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient158();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient68();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient88();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient39();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient129();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient196();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient28();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient243();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient88();
        java.net.Proxy proxy10 = serializedObjectSupporter0.deserializeObjectProxy2();
        java.lang.String str11 = proxy10.toString();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HTTP @ inesserver1.windows.cin.ufpe.br/172.20.26.2:45413" + "'", str11, "HTTP @ inesserver1.windows.cin.ufpe.br/172.20.26.2:45413");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient52();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient119();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient242();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient227();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient228();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient192();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient84();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient137();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient10();
        com.squareup.okhttp.ConnectionPool connectionPool9 = okHttpClient8.connectionPool;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(connectionPool9);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient161();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient210();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient245();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient241();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient166();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient137();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient57();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient68();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy4();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient13();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient107();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient233();
        java.net.Proxy proxy11 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        java.net.Proxy proxy13 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter15 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy16 = serializedObjectSupporter15.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = serializedObjectSupporter15.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient18 = serializedObjectSupporter15.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient19 = serializedObjectSupporter15.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient20 = serializedObjectSupporter15.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient21 = serializedObjectSupporter15.deserializeObjectOkHttpClient89();
        java.net.Proxy proxy22 = serializedObjectSupporter15.deserializeObjectProxy2();
        okHttpClient14.proxy = proxy22;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(proxy11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(proxy13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(proxy16);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(proxy22);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient167();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient173();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient107();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient128();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient239();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient206();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient132();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient35();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient43();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient220();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient242();
        java.net.Proxy proxy12 = serializedObjectSupporter0.deserializeObjectProxy9();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(proxy12);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) (byte) 0, (long) 'a');
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient92();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy2();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) ' ', (long) (short) 0);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient206();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient26();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient27();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient84();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient204();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient91();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient242();
        java.net.Proxy proxy10 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter6.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter6.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter6.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter6.deserializeObjectOkHttpClient189();
        okHttpClient5.serializedObjectSupporter = serializedObjectSupporter6;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter6.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter6.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter6.deserializeObjectOkHttpClient248();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter6.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter6.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = serializedObjectSupporter6.deserializeObjectOkHttpClient255();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient17);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient137();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient226();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient28();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient167();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient58();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter6.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter6.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter6.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter6.deserializeObjectOkHttpClient189();
        okHttpClient5.serializedObjectSupporter = serializedObjectSupporter6;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter6.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter6.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter6.deserializeObjectOkHttpClient18();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter6.deserializeObjectOkHttpClient24();
        com.squareup.okhttp.ConnectionPool connectionPool16 = okHttpClient15.connectionPool;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(connectionPool16);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient210();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient48();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient228();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient247();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient235();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient204();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient91();
        java.net.ProxySelector proxySelector9 = java.net.ProxySelector.getDefault();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.ProxySelector.setDefault(proxySelector9);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxySelector9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient179();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient167();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient213();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient192();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient134();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient246();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient168();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient53();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient233();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient207();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient128();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient246();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient202();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient26();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.ConnectionPool connectionPool14 = new com.squareup.okhttp.ConnectionPool((int) (byte) 1, (long) (short) 1);
        okHttpClient11.connectionPool = connectionPool14;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient56();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient258();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) '#', (long) (byte) 0);
        int int3 = connectionPool2.getSpdyConnectionCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient42();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient172();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket5 = socketFactory0.createSocket("DIRECT", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient128();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient188();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient148();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient121();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient131();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient239();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient50();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        java.net.Proxy proxy9 = okHttpClient8.proxy;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxy9);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) '4', (long) (byte) 10);
        com.squareup.okhttp.Connection connection3 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectionPool2.maybeShare(connection3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient129();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy4();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient5.copyWithDefaults();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient232();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        java.net.Proxy proxy11 = serializedObjectSupporter0.deserializeObjectProxy2();
        java.net.Proxy proxy12 = serializedObjectSupporter0.deserializeObjectProxy6();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(proxy11);
        org.junit.Assert.assertNotNull(proxy12);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) '4', (long) '#');
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy5();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient55();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient204();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient245();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient230();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient44();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = okHttpClient7.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(sSLSocketFactory8);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient180();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient164();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter6.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter6.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter6.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter6.deserializeObjectOkHttpClient189();
        okHttpClient5.serializedObjectSupporter = serializedObjectSupporter6;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter6.deserializeObjectOkHttpClient119();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter6.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter6.deserializeObjectOkHttpClient259();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient44();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient112();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket5 = socketFactory0.createSocket("hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter6.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter6.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter6.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter6.deserializeObjectOkHttpClient189();
        okHttpClient5.serializedObjectSupporter = serializedObjectSupporter6;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter6.deserializeObjectOkHttpClient239();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter6.deserializeObjectOkHttpClient203();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter6.deserializeObjectOkHttpClient239();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient168();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter7 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter7.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter7.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter7.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter7.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter7.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter7.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter7.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter7.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter7.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = serializedObjectSupporter7.deserializeObjectOkHttpClient236();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory18 = okHttpClient17.getSslSocketFactory();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter19 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy20 = serializedObjectSupporter19.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient21 = serializedObjectSupporter19.deserializeObjectOkHttpClient135();
        java.net.ResponseCache responseCache22 = okHttpClient21.getResponseCache();
        java.net.ProxySelector proxySelector23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient21.setProxySelector(proxySelector23);
        java.net.CookieHandler cookieHandler25 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient21.setCookieHandler(cookieHandler25);
        java.net.ProxySelector proxySelector27 = java.net.ProxySelector.getDefault();
        okHttpClient21.proxySelector = proxySelector27;
        okHttpClient17.proxySelector = proxySelector27;
        com.squareup.okhttp.OkHttpClient okHttpClient30 = okHttpClient6.setProxySelector(proxySelector27);
        java.net.URI uRI31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.net.Proxy> proxyList32 = proxySelector27.select(uRI31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URI can't be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(sSLSocketFactory18);
        org.junit.Assert.assertNotNull(proxy20);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNull(responseCache22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient26);
        org.junit.Assert.assertNotNull(proxySelector27);
        org.junit.Assert.assertNotNull(okHttpClient30);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient3();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient128();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy8();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient247();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient252();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy9();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient27();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = okHttpClient10.sslSocketFactory;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(sSLSocketFactory11);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient12();
        java.net.Proxy proxy8 = okHttpClient7.proxy;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxy8);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient117();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient98();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        java.util.Set<com.squareup.okhttp.Route> routeSet3 = okHttpClient2.getfailedRoutes();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(routeSet3);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool(100, (long) (byte) 100);
        com.squareup.okhttp.Connection connection3 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectionPool2.recycle(connection3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient213();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient117();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient212();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient180();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient119();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient213();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient192();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient62();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient49();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient62();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient56();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient258();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter6.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter6.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter6.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter6.deserializeObjectOkHttpClient189();
        okHttpClient5.serializedObjectSupporter = serializedObjectSupporter6;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter6.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter6.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter6.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter6.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter6.deserializeObjectOkHttpClient54();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = serializedObjectSupporter6.deserializeObjectOkHttpClient51();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient17);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient148();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        java.net.ResponseCache responseCache4 = okHttpClient3.responseCache;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(responseCache4);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient52();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient71();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient196();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter6.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter6.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter6.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter6.deserializeObjectOkHttpClient189();
        okHttpClient5.serializedObjectSupporter = serializedObjectSupporter6;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter6.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter6.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter6.deserializeObjectOkHttpClient248();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter6.deserializeObjectOkHttpClient255();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter6.deserializeObjectOkHttpClient185();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient150();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient137();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient164();
        java.net.Proxy proxy11 = serializedObjectSupporter0.deserializeObjectProxy10();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(proxy11);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool(10, 0L);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient7();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient44();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient244();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient258();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient196();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy2();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient107();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        java.net.ResponseCache responseCache5 = okHttpClient4.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(responseCache5);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy7 = serializedObjectSupporter6.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter6.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter6.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter6.deserializeObjectOkHttpClient192();
        java.net.Proxy.Type type11 = null;
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter12 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter12.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter12.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter12.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter12.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = serializedObjectSupporter12.deserializeObjectOkHttpClient163();
        java.net.Proxy proxy18 = serializedObjectSupporter12.deserializeObjectProxy5();
        java.net.SocketAddress socketAddress19 = proxy18.address();
        java.net.Proxy proxy20 = new java.net.Proxy(type11, socketAddress19);
        okHttpClient10.proxy = proxy20;
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter22 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient23 = serializedObjectSupporter22.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient24 = serializedObjectSupporter22.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient25 = serializedObjectSupporter22.deserializeObjectOkHttpClient207();
        com.squareup.okhttp.OkHttpClient okHttpClient26 = serializedObjectSupporter22.deserializeObjectOkHttpClient150();
        java.net.Proxy proxy27 = serializedObjectSupporter22.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient28 = serializedObjectSupporter22.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient29 = serializedObjectSupporter22.deserializeObjectOkHttpClient105();
        boolean boolean30 = proxy20.equals((java.lang.Object) serializedObjectSupporter22);
        okHttpClient5.proxy = proxy20;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(proxy18);
        org.junit.Assert.assertNotNull(socketAddress19);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient25);
        org.junit.Assert.assertNotNull(okHttpClient26);
        org.junit.Assert.assertNotNull(proxy27);
        org.junit.Assert.assertNotNull(okHttpClient28);
        org.junit.Assert.assertNotNull(okHttpClient29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient121();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient96();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter6.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter6.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter6.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter6.deserializeObjectOkHttpClient189();
        okHttpClient5.serializedObjectSupporter = serializedObjectSupporter6;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter6.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter6.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter6.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter6.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter6.deserializeObjectOkHttpClient54();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = serializedObjectSupporter6.deserializeObjectOkHttpClient52();
        com.squareup.okhttp.OkHttpClient okHttpClient18 = serializedObjectSupporter6.deserializeObjectOkHttpClient134();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient201();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient233();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient7();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient44();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient12();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient210();
        java.net.Proxy proxy12 = serializedObjectSupporter0.deserializeObjectProxy2();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(proxy12);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient140();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient59();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient160();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient232();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient235();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient167();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient173();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient160();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient107();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient23();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient226();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient173();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool(1, (long) (byte) 100);
        int int3 = connectionPool2.getSpdyConnectionCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter6.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter6.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter6.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter6.deserializeObjectOkHttpClient189();
        okHttpClient5.serializedObjectSupporter = serializedObjectSupporter6;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter6.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter6.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter6.deserializeObjectOkHttpClient248();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter6.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter6.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = serializedObjectSupporter6.deserializeObjectOkHttpClient199();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient17);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient53();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        java.net.Proxy proxy2 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient186();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient110();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient246();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(proxy2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient220();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient157();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket4 = socketFactory0.createSocket("DIRECT", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: DIRECT");
        } catch (java.net.UnknownHostException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient226();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient7();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient44();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient6.copyWithDefaults();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient210();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        java.net.Proxy proxy10 = serializedObjectSupporter0.deserializeObjectProxy9();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(proxy10);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool(1, (long) (short) 0);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) (byte) 0, 0L);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter6.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter6.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter6.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter6.deserializeObjectOkHttpClient189();
        okHttpClient5.serializedObjectSupporter = serializedObjectSupporter6;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter6.deserializeObjectOkHttpClient119();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter6.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter6.deserializeObjectOkHttpClient141();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) 'a', (long) 100);
        connectionPool2.evictAll();
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient164();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient99();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient207();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient150();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient105();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient196();
        boolean boolean4 = okHttpClient3.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient230();
        okHttpClient4.followProtocolRedirects = false;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = okHttpClient4.hostnameVerifier;
        com.squareup.okhttp.ConnectionPool connectionPool6 = okHttpClient4.connectionPool;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(hostnameVerifier5);
        org.junit.Assert.assertNull(connectionPool6);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient202();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient26();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) ' ', (long) 100);
        com.squareup.okhttp.Connection connection3 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectionPool2.maybeShare(connection3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.internal.http.OkResponseCache okResponseCache6 = okHttpClient5.okResponseCache();
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = okHttpClient5.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(okResponseCache6);
        org.junit.Assert.assertNull(okAuthenticator7);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient210();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient51();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient245();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket5 = socketFactory0.createSocket("DIRECT", 0, inetAddress3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient191();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient178();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient192();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient210();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient97();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient57();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient156();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient173();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool(0, (long) (byte) 1);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient179();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient258();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient228();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient156();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter3 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter3.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter3.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter3.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter3.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter3.deserializeObjectOkHttpClient203();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter3.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter3.deserializeObjectOkHttpClient12();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter3.deserializeObjectOkHttpClient140();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter3.deserializeObjectOkHttpClient180();
        java.net.Proxy proxy13 = serializedObjectSupporter3.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient2.setProxy(proxy13);
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(proxy13);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient147();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient141();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient202();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient191();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient151();
        java.net.Proxy proxy13 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient23();
        java.net.Proxy proxy15 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter0.deserializeObjectOkHttpClient157();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(proxy13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(proxy15);
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient233();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient42();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections7 = serializedObjectSupporter0.deserializeObjectList1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient213();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient192();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient134();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy5();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(proxy8);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient206();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient25();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient150();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient90();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        java.net.Proxy proxy10 = serializedObjectSupporter0.deserializeObjectProxy9();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient260();
        java.net.Proxy proxy12 = serializedObjectSupporter0.deserializeObjectProxy2();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(proxy12);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) '#', (long) (short) 0);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient206();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient247();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient204();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient233();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient202();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient233();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient48();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
        boolean boolean8 = okHttpClient7.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient247();
        java.net.Proxy proxy8 = okHttpClient7.getProxy();
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = okHttpClient7.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNull(okAuthenticator9);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient140();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient43();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient18();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient51();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient92();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient90();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient51();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient255();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy4();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy9);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter6.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter6.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter6.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter6.deserializeObjectOkHttpClient189();
        okHttpClient5.serializedObjectSupporter = serializedObjectSupporter6;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter6.deserializeObjectOkHttpClient239();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter6.deserializeObjectOkHttpClient203();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter6.deserializeObjectOkHttpClient57();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient143();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient235();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient210();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient143();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient113();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient28();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setFollowProtocolRedirects(true);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient92();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient176();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter12 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter12.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter12.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter12.deserializeObjectOkHttpClient69();
        java.util.List<java.lang.String> strList16 = okHttpClient15.getDEFAULT_TRANSPORTS();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient11.setTransports(strList16);
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter18 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient19 = serializedObjectSupporter18.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient20 = serializedObjectSupporter18.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient21 = serializedObjectSupporter18.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient22 = serializedObjectSupporter18.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient23 = serializedObjectSupporter18.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient24 = serializedObjectSupporter18.deserializeObjectOkHttpClient206();
        com.squareup.okhttp.OkHttpClient okHttpClient25 = serializedObjectSupporter18.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient26 = serializedObjectSupporter18.deserializeObjectOkHttpClient248();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter27 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient28 = serializedObjectSupporter27.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient29 = serializedObjectSupporter27.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient30 = serializedObjectSupporter27.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient31 = serializedObjectSupporter27.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient32 = serializedObjectSupporter27.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient33 = serializedObjectSupporter27.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient34 = serializedObjectSupporter27.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter35 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient36 = serializedObjectSupporter35.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient37 = serializedObjectSupporter35.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient38 = serializedObjectSupporter35.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient39 = serializedObjectSupporter35.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient40 = serializedObjectSupporter35.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter41 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient42 = serializedObjectSupporter41.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient43 = serializedObjectSupporter41.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient44 = serializedObjectSupporter41.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient45 = serializedObjectSupporter41.deserializeObjectOkHttpClient189();
        okHttpClient40.serializedObjectSupporter = serializedObjectSupporter41;
        com.squareup.okhttp.OkHttpClient okHttpClient47 = serializedObjectSupporter41.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient48 = serializedObjectSupporter41.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient49 = serializedObjectSupporter41.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient50 = serializedObjectSupporter41.deserializeObjectOkHttpClient182();
        java.util.List<java.lang.String> strList51 = okHttpClient50.getDEFAULT_TRANSPORTS();
        okHttpClient34.transports = strList51;
        com.squareup.okhttp.OkHttpClient okHttpClient53 = okHttpClient26.setTransports(strList51);
        com.squareup.okhttp.OkHttpClient okHttpClient54 = okHttpClient11.setTransports(strList51);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient25);
        org.junit.Assert.assertNotNull(okHttpClient26);
        org.junit.Assert.assertNotNull(okHttpClient28);
        org.junit.Assert.assertNotNull(okHttpClient29);
        org.junit.Assert.assertNotNull(okHttpClient30);
        org.junit.Assert.assertNotNull(okHttpClient31);
        org.junit.Assert.assertNotNull(okHttpClient32);
        org.junit.Assert.assertNotNull(okHttpClient33);
        org.junit.Assert.assertNotNull(okHttpClient34);
        org.junit.Assert.assertNotNull(okHttpClient36);
        org.junit.Assert.assertNotNull(okHttpClient37);
        org.junit.Assert.assertNotNull(okHttpClient38);
        org.junit.Assert.assertNotNull(okHttpClient39);
        org.junit.Assert.assertNotNull(okHttpClient40);
        org.junit.Assert.assertNotNull(okHttpClient42);
        org.junit.Assert.assertNotNull(okHttpClient43);
        org.junit.Assert.assertNotNull(okHttpClient44);
        org.junit.Assert.assertNotNull(okHttpClient45);
        org.junit.Assert.assertNotNull(okHttpClient47);
        org.junit.Assert.assertNotNull(okHttpClient48);
        org.junit.Assert.assertNotNull(okHttpClient49);
        org.junit.Assert.assertNotNull(okHttpClient50);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(okHttpClient53);
        org.junit.Assert.assertNotNull(okHttpClient54);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy9();
        java.lang.String str5 = proxy4.toString();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HTTP @ inesserver1.windows.cin.ufpe.br/172.20.26.2:40903" + "'", str5, "HTTP @ inesserver1.windows.cin.ufpe.br/172.20.26.2:40903");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient129();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient49();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient7();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter4 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy5 = serializedObjectSupporter4.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter4.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter4.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter4.deserializeObjectOkHttpClient254();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter4.deserializeObjectOkHttpClient32();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter4.deserializeObjectOkHttpClient139();
        java.net.Proxy proxy11 = serializedObjectSupporter4.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter4.deserializeObjectOkHttpClient243();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter4.deserializeObjectOkHttpClient88();
        java.net.Proxy proxy14 = serializedObjectSupporter4.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter4.deserializeObjectOkHttpClient126();
        okHttpClient3.serializedObjectSupporter = serializedObjectSupporter4;
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(proxy11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(proxy14);
        org.junit.Assert.assertNotNull(okHttpClient15);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient141();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient121();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient196();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient129();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient164();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient213();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient21();
        java.net.CookieHandler cookieHandler14 = okHttpClient13.getCookieHandler();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(cookieHandler14);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient129();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy4();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient33();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient260();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient176();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient180();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient168();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient97();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient233();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient131();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setFollowProtocolRedirects(false);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient121();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient53();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient167();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient58();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        java.lang.Class<?> wildcardClass8 = okHttpClient7.getClass();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient167();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient173();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient160();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient222();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient121();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy8();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(proxy8);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient248();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient176();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient8.copyWithDefaults();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient107();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = new com.squareup.okhttp.OkHttpClient(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.InetAddress inetAddress1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket3 = socketFactory0.createSocket(inetAddress1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient97();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy6();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        java.net.Proxy proxy2 = serializedObjectSupporter0.deserializeObjectProxy6();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(proxy2);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient107();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient233();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient168();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient157();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient71();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy9();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient5.getSslSocketFactory();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient213();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient192();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient134();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient62();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient28();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient232();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient43();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient249();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient42();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient50();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection10 = okHttpClient8.open(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        java.net.ResponseCache responseCache7 = okHttpClient6.getResponseCache();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(responseCache7);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient206();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient132();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient107();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient10.copyWithDefaults();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) (byte) 0, (long) 100);
        int int3 = connectionPool2.getConnectionCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient243();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient250();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient12();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = new com.squareup.okhttp.OkHttpClient(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient1);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient99();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient179();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient258();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient99();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter7 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy8 = serializedObjectSupporter7.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter7.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter7.deserializeObjectOkHttpClient213();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter7.deserializeObjectOkHttpClient192();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter7.deserializeObjectOkHttpClient134();
        boolean boolean13 = proxy6.equals((java.lang.Object) okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient67();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient245();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient129();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient220();
        com.squareup.okhttp.ConnectionPool connectionPool11 = new com.squareup.okhttp.ConnectionPool((int) (byte) 1, (long) '#');
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient8.setConnectionPool(connectionPool11);
        connectionPool11.evictAll();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient206();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient25();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient246();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient24();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }
}

