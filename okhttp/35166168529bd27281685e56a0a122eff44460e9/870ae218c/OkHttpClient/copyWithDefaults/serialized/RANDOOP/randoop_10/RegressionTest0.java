import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        java.net.ResponseCache responseCache4 = okHttpClient3.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(responseCache4);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        okHttpClient3.authenticator = okAuthenticator4;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient39();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections6 = serializedObjectSupporter0.deserializeObjectSet1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$SynchronizedSet cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        javax.net.ssl.HostnameVerifier hostnameVerifier2 = okHttpClient1.hostnameVerifier;
        com.squareup.okhttp.ConnectionPool connectionPool3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient1.setConnectionPool(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNull(hostnameVerifier2);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        java.net.Proxy proxy2 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient202();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(proxy2);
        org.junit.Assert.assertNotNull(okHttpClient3);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setFollowProtocolRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = okHttpClient5.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(sSLSocketFactory8);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient84();
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = okHttpClient6.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(hostnameVerifier7);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setFollowProtocolRedirects(true);
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter8 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter8.deserializeObjectOkHttpClient199();
        java.net.Proxy proxy10 = serializedObjectSupporter8.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient7.setProxy(proxy10);
        java.net.ProxySelector proxySelector12 = null;
        okHttpClient7.proxySelector = proxySelector12;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        okHttpClient6.connectionPool = connectionPool7;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient10.getHostnameVerifier();
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
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient213();
        java.lang.Class<?> wildcardClass4 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        java.net.ResponseCache responseCache2 = okHttpClient1.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNull(responseCache2);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        java.net.Proxy proxy8 = okHttpClient7.getProxy();
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
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections6 = serializedObjectSupporter0.deserializeObjectList1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient49();
        okHttpClient11.followProtocolRedirects = true;
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
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient111();
        java.net.CookieHandler cookieHandler6 = null;
        okHttpClient5.cookieHandler = cookieHandler6;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient21();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections7 = serializedObjectSupporter0.deserializeObjectSet1();
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
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient84();
        com.squareup.okhttp.ConnectionPool connectionPool7 = okHttpClient6.getConnectionPool();
        okHttpClient6.followProtocolRedirects = true;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(connectionPool7);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        java.net.ResponseCache responseCache10 = okHttpClient9.getResponseCache();
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection12 = okHttpClient9.open(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(responseCache10);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient18();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient97();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient147();
        java.net.Proxy proxy8 = okHttpClient7.getProxy();
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
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient227();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient21();
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection16 = okHttpClient14.open(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient156();
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        okHttpClient7.authenticator = okAuthenticator8;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient39();
        java.net.Proxy proxy6 = okHttpClient5.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(proxy6);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        java.net.Proxy proxy2 = serializedObjectSupporter0.deserializeObjectProxy5();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections3 = serializedObjectSupporter0.deserializeObjectList1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(proxy2);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.ConnectionPool connectionPool11 = okHttpClient10.connectionPool;
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
        org.junit.Assert.assertNull(connectionPool11);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        okHttpClient6.authenticator = okAuthenticator7;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient84();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient71();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
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
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient248();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        okHttpClient3.followProtocolRedirects = false;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        java.net.ResponseCache responseCache2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient1.setResponseCache(responseCache2);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient3);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient88();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setAuthenticator(okAuthenticator9);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient2();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient88();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient117();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = null;
        okHttpClient9.sslSocketFactory = sSLSocketFactory10;
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
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient49();
        com.squareup.okhttp.ConnectionPool connectionPool12 = okHttpClient11.connectionPool;
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
        org.junit.Assert.assertNull(connectionPool12);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        java.net.ResponseCache responseCache12 = null;
        okHttpClient11.responseCache = responseCache12;
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
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient226();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient9();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient248();
        java.net.ResponseCache responseCache7 = null;
        okHttpClient6.responseCache = responseCache7;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient88();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setAuthenticator(okAuthenticator8);
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
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        java.net.Proxy proxy2 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(proxy2);
        org.junit.Assert.assertNotNull(okHttpClient3);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient147();
        java.net.CookieHandler cookieHandler8 = okHttpClient7.cookieHandler;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(cookieHandler8);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory2 = null;
        okHttpClient1.sslSocketFactory = sSLSocketFactory2;
        org.junit.Assert.assertNotNull(okHttpClient1);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        okHttpClient4.followProtocolRedirects = true;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient44();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
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
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.ConnectionPool connectionPool7 = okHttpClient6.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(connectionPool7);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient110();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory9);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ResponseCache responseCache5 = null;
        okHttpClient4.responseCache = responseCache5;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = okHttpClient5.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient34();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
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
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        java.net.ProxySelector proxySelector7 = null;
        okHttpClient6.proxySelector = proxySelector7;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient180();
        java.net.URL uRL4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection5 = okHttpClient3.open(uRL4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient59();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient141();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient92();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient127();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        java.net.Proxy proxy13 = okHttpClient12.getProxy();
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
        org.junit.Assert.assertNull(proxy13);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
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
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient166();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient52();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient44();
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
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient146();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient62();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        java.net.ProxySelector proxySelector5 = okHttpClient4.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(proxySelector5);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient166();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient52();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient56();
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
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient151();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient256();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient152();
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
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient260();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient146();
        boolean boolean6 = okHttpClient5.followProtocolRedirects;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient212();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter9 = okHttpClient8.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(serializedObjectSupporter9);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy9();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient133();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient9();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient186();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient141();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient216();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.Route[] routeArray8 = new com.squareup.okhttp.Route[] {};
        java.util.LinkedHashSet<com.squareup.okhttp.Route> routeSet9 = new java.util.LinkedHashSet<com.squareup.okhttp.Route>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.squareup.okhttp.Route>) routeSet9, routeArray8);
        okHttpClient7.setfailedRoutes((java.util.Set<com.squareup.okhttp.Route>) routeSet9);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(routeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient248();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        boolean boolean3 = okHttpClient2.followProtocolRedirects;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient11.getHostnameVerifier();
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
        org.junit.Assert.assertNull(hostnameVerifier12);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient166();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient52();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        java.net.ResponseCache responseCache10 = null;
        okHttpClient9.responseCache = responseCache10;
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
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient151();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient39();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter3 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter3.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter3.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter3.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter3.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter3.deserializeObjectOkHttpClient182();
        java.net.Proxy proxy9 = serializedObjectSupporter3.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter3.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter3.deserializeObjectOkHttpClient152();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter3.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter3.deserializeObjectOkHttpClient209();
        java.util.Set<com.squareup.okhttp.Route> routeSet14 = okHttpClient13.getfailedRoutes();
        okHttpClient2.setfailedRoutes(routeSet14);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(routeSet14);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy8();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient105();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient98();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient7();
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
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy7();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy9();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(proxy7);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient27();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        java.net.CookieHandler cookieHandler10 = null;
        okHttpClient9.cookieHandler = cookieHandler10;
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
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient156();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy9();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        java.net.ResponseCache responseCache11 = null;
        okHttpClient10.responseCache = responseCache11;
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
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient152();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient28();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient173();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient256();
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
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
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
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient36();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient113();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient113();
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
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient133();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient24();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient192();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections4 = serializedObjectSupporter0.deserializeObjectSet1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$SynchronizedSet cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections5 = serializedObjectSupporter0.deserializeObjectList3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setFollowProtocolRedirects(true);
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter8 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter8.deserializeObjectOkHttpClient199();
        java.net.Proxy proxy10 = serializedObjectSupporter8.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient7.setProxy(proxy10);
        boolean boolean12 = okHttpClient11.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient166();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient170();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
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
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient220();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = okHttpClient8.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(okAuthenticator11);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections8 = serializedObjectSupporter0.deserializeObjectSet1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$SynchronizedSet cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient227();
        com.squareup.okhttp.ConnectionPool connectionPool7 = okHttpClient6.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(connectionPool7);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient99();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient152();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient233();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient39();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient52();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient88();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient246();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient9();
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
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient35();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.ConnectionPool connectionPool11 = okHttpClient10.connectionPool;
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
        org.junit.Assert.assertNull(connectionPool11);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient56();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter12 = okHttpClient11.serializedObjectSupporter;
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
        org.junit.Assert.assertNull(serializedObjectSupporter12);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient28();
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
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient44();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient151();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient28();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        java.net.ResponseCache responseCache9 = okHttpClient8.responseCache;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient213();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient141();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient36();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient167();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter9 = okHttpClient8.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(serializedObjectSupporter9);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient53();
        com.squareup.okhttp.internal.http.OkResponseCache okResponseCache8 = okHttpClient7.okResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(okResponseCache8);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient166();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient260();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient233();
        java.lang.Class<?> wildcardClass10 = okHttpClient9.getClass();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient179();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections8 = serializedObjectSupporter0.deserializeObjectList3();
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
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
        java.net.CookieHandler cookieHandler5 = null;
        okHttpClient4.cookieHandler = cookieHandler5;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient151();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient157();
        boolean boolean7 = okHttpClient6.followProtocolRedirects;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient34();
        java.net.CookieHandler cookieHandler8 = okHttpClient7.getCookieHandler();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(cookieHandler8);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy7();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient227();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient90();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter0.deserializeObjectOkHttpClient253();
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
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient44();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient36();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient151();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient157();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient157();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient39();
        java.lang.Class<?> wildcardClass10 = okHttpClient9.getClass();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.internal.http.OkResponseCache okResponseCache9 = okHttpClient8.okResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(okResponseCache9);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient106();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        java.net.Proxy proxy4 = okHttpClient3.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxy4);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient129();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections8 = serializedObjectSupporter0.deserializeObjectList3();
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
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient13();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        java.net.ProxySelector proxySelector11 = null;
        okHttpClient10.proxySelector = proxySelector11;
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
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient116();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient178();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient59();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
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
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
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
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient55();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient7();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient134();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        java.net.Proxy proxy2 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient50();
        java.net.CookieHandler cookieHandler4 = null;
        okHttpClient3.cookieHandler = cookieHandler4;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(proxy2);
        org.junit.Assert.assertNotNull(okHttpClient3);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient151();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient157();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient157();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient256();
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
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient88();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
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
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient28();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        java.net.ResponseCache responseCache8 = okHttpClient7.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(responseCache8);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient34();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.internal.http.OkResponseCache okResponseCache10 = okHttpClient9.okResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(okResponseCache10);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient88();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient126();
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
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient55();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient7();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient143();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient113();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient166();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient170();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections9 = serializedObjectSupporter0.deserializeObjectSet1();
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
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient48();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient167();
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setCookieHandler(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient98();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient57();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient249();
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
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient84();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient71();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections8 = serializedObjectSupporter0.deserializeObjectSet1();
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
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient166();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient260();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient21();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections10 = serializedObjectSupporter0.deserializeObjectSet1();
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
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient127();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient91();
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
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient204();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient220();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient51();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient21();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient140();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient48();
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
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient28();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient51();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient92();
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
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient23();
        java.net.ProxySelector proxySelector9 = null;
        okHttpClient8.proxySelector = proxySelector9;
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
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient39();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient50();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient39();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient201();
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
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient220();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient232();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setHostnameVerifier(hostnameVerifier14);
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
        org.junit.Assert.assertNotNull(okHttpClient15);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient170();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient253();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient235();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        java.net.CookieHandler cookieHandler15 = okHttpClient14.getCookieHandler();
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
        org.junit.Assert.assertNull(cookieHandler15);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
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
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient245();
        java.net.Proxy proxy5 = okHttpClient4.proxy;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(proxy5);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient18();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient97();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient226();
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
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient227();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient21();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter0.deserializeObjectOkHttpClient129();
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
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient212();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
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
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient51();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient110();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient97();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections10 = serializedObjectSupporter0.deserializeObjectSet1();
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
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient28();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient2();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient2();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient212();
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
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient5.copyWithDefaults();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient98();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient57();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setResponseCache(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient210();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
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
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient146();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = okHttpClient6.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(sSLSocketFactory7);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient88();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient117();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient235();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient173();
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
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        okHttpClient5.sslSocketFactory = sSLSocketFactory6;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient248();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        okHttpClient6.connectionPool = connectionPool7;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
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
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = null;
        okHttpClient6.hostnameVerifier = hostnameVerifier7;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient147();
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
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient53();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
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
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient227();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient90();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
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
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient55();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient132();
        com.squareup.okhttp.internal.http.OkResponseCache okResponseCache6 = okHttpClient5.okResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(okResponseCache6);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient141();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient143();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient2();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient192();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient170();
        java.util.Set<com.squareup.okhttp.Route> routeSet12 = null;
        okHttpClient11.failedRoutes = routeSet12;
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
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient44();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient227();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient220();
        java.util.Set<com.squareup.okhttp.Route> routeSet4 = okHttpClient3.getfailedRoutes();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(routeSet4);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
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
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient226();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient53();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.ConnectionPool connectionPool10 = okHttpClient9.connectionPool;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(connectionPool10);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient141();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient28();
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
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient216();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient209();
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
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient88();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient117();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient216();
        java.net.ResponseCache responseCache11 = okHttpClient10.getResponseCache();
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
        org.junit.Assert.assertNull(responseCache11);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
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
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient18();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient97();
        java.net.CookieHandler cookieHandler7 = null;
        okHttpClient6.cookieHandler = cookieHandler7;
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = okHttpClient6.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(okAuthenticator9);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient116();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient170();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
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
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient90();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient55();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient88();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient172();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient246();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
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
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient227();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient21();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient15.copyWithDefaults();
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
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient170();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient146();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient196();
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
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        okHttpClient8.sslSocketFactory = sSLSocketFactory9;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.copyWithDefaults();
        java.util.Set<com.squareup.okhttp.Route> routeSet12 = okHttpClient11.failedRoutes;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(routeSet12);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient84();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient62();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient56();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient110();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient178();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient90();
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
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient258();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient92();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient67();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient99();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient112();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient98();
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
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        java.net.ProxySelector proxySelector6 = null;
        okHttpClient5.proxySelector = proxySelector6;
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = okHttpClient5.hostnameVerifier;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(hostnameVerifier8);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient216();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient39();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient99();
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
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient212();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
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
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient209();
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setCookieHandler(cookieHandler7);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient33();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient49();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient250();
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
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient156();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy9();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient222();
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
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient90();
        java.net.ProxySelector proxySelector6 = null;
        okHttpClient5.proxySelector = proxySelector6;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient34();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient132();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient255();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
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
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient151();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient170();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient247();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
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
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient251();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient59();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient7.copyWithDefaults();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setFollowProtocolRedirects(false);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        java.net.ResponseCache responseCache4 = null;
        okHttpClient3.responseCache = responseCache4;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient28();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient2();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient28();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient252();
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
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient110();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient127();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient23();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy8();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient105();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient39();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient134();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy8();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient256();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient258();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient239();
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
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient59();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient180();
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
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient151();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient157();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient157();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient137();
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
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient34();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient250();
        org.junit.Assert.assertNotNull(okHttpClient1);
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
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient21();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient140();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
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
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        java.net.ProxySelector proxySelector7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxySelector(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient18();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient97();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient147();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        okHttpClient8.authenticator = okAuthenticator9;
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
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient131();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient220();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient180();
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
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient128();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
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
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient84();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient62();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient56();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient110();
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
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient24();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient235();
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
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient251();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient172();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient247();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        java.net.Proxy proxy9 = okHttpClient8.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxy9);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient260();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
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
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient133();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkAuthenticator okAuthenticator6 = null;
        okHttpClient5.authenticator = okAuthenticator6;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient220();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient252();
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
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient99();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter8 = okHttpClient7.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = okHttpClient6.authenticator;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(okAuthenticator7);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient151();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient157();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient92();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
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
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient213();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient141();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = okHttpClient6.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(sSLSocketFactory7);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
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
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient179();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
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
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient116();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.internal.http.OkResponseCache okResponseCache10 = okHttpClient9.okResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(okResponseCache10);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient156();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = okHttpClient5.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient166();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient23();
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
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient179();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
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
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setFollowProtocolRedirects(false);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient127();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient143();
        com.squareup.okhttp.internal.http.OkResponseCache okResponseCache8 = okHttpClient7.okResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(okResponseCache8);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient59();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        java.net.ResponseCache responseCache12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setResponseCache(responseCache12);
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
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient170();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient253();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient55();
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setHostnameVerifier(hostnameVerifier14);
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
        org.junit.Assert.assertNotNull(okHttpClient15);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient49();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient67();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter7 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter7.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter7.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter7.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter11 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter11.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter11.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter11.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter11.deserializeObjectOkHttpClient221();
        java.net.Proxy proxy16 = serializedObjectSupporter11.deserializeObjectProxy10();
        okHttpClient10.proxy = proxy16;
        java.net.Proxy proxy18 = okHttpClient10.getProxy();
        okHttpClient6.proxy = proxy18;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(proxy16);
        org.junit.Assert.assertNotNull(proxy18);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient36();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient167();
        java.net.ResponseCache responseCache9 = okHttpClient8.responseCache;
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection11 = okHttpClient8.open(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(responseCache9);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient141();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient179();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = null;
        okHttpClient6.hostnameVerifier = hostnameVerifier7;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient213();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient28();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient2();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient233();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient9();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient44();
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
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient59();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient43();
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
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient116();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient59();
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
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient49();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient53();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient152();
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
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient2();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient150();
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = okHttpClient6.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(hostnameVerifier7);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient18();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient97();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient226();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        boolean boolean11 = okHttpClient10.followProtocolRedirects;
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient36();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
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
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient2();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient216();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient43();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient151();
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
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient235();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter9 = okHttpClient8.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(serializedObjectSupporter9);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient226();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient44();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient49();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        java.net.CookieHandler cookieHandler14 = okHttpClient13.cookieHandler;
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
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient201();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient146();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient167();
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
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient226();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient53();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
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
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient156();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient84();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
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
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient88();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient216();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient246();
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
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient98();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient57();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient112();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
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
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient99();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient68();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy6();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(proxy8);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient110();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient111();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        java.net.CookieHandler cookieHandler7 = okHttpClient6.getCookieHandler();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(cookieHandler7);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient146();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient251();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient92();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient242();
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
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient227();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient25();
        com.squareup.okhttp.OkAuthenticator okAuthenticator14 = okHttpClient13.getAuthenticator();
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
        org.junit.Assert.assertNull(okAuthenticator14);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient260();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient151();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient25();
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
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient227();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient21();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        java.net.ResponseCache responseCache17 = null;
        okHttpClient16.responseCache = responseCache17;
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
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient59();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient255();
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
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        okHttpClient6.followProtocolRedirects = true;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient12();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        okHttpClient9.authenticator = okAuthenticator10;
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
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient12();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient48();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient42();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient10();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient227();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient205();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter0.deserializeObjectOkHttpClient55();
        java.net.Proxy proxy16 = okHttpClient15.getProxy();
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
        org.junit.Assert.assertNull(proxy16);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient12();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient249();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient242();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
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
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient35();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient105();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient62();
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
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient99();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient50();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
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
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient151();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient157();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient210();
        okHttpClient7.followProtocolRedirects = true;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient116();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient179();
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
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient131();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient67();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient68();
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
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient152();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient106();
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
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient147();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient26();
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
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient220();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient158();
        java.net.Proxy proxy13 = serializedObjectSupporter0.deserializeObjectProxy4();
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
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient151();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient157();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient92();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
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
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient88();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy9();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
        java.lang.Class<?> wildcardClass11 = serializedObjectSupporter0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient166();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient170();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient112();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient106();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient43();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
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
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient172();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient51();
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
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient147();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient213();
        java.net.ProxySelector proxySelector4 = okHttpClient3.proxySelector;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.copyWithDefaults();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxySelector4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient121();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient128();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient18();
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
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient110();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient117();
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
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient133();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = null;
        okHttpClient2.sslSocketFactory = sSLSocketFactory3;
        com.squareup.okhttp.ConnectionPool connectionPool5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setConnectionPool(connectionPool5);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient151();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient52();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient50();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient84();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient3();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient191();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient156();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient98();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient35();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient204();
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
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient36();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient158();
        org.junit.Assert.assertNotNull(okHttpClient1);
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
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient44();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient44();
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
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient52();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
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
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient88();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
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
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient2();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient216();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient43();
        java.net.Proxy proxy14 = serializedObjectSupporter0.deserializeObjectProxy3();
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
        org.junit.Assert.assertNotNull(proxy14);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient53();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
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
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient128();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setCookieHandler(cookieHandler9);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient18();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient97();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient226();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        com.squareup.okhttp.ConnectionPool connectionPool11 = okHttpClient10.getConnectionPool();
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
        org.junit.Assert.assertNull(connectionPool11);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient12();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient156();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient256();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        java.net.Proxy proxy13 = serializedObjectSupporter0.deserializeObjectProxy8();
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
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient2();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient88();
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
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient48();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient98();
        java.net.ResponseCache responseCache7 = null;
        okHttpClient6.responseCache = responseCache7;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient201();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
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
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient44();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient180();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient249();
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
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient111();
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
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient255();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient141();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient179();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient206();
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
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient35();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient105();
        java.net.ResponseCache responseCache12 = okHttpClient11.responseCache;
        com.squareup.okhttp.ConnectionPool connectionPool13 = okHttpClient11.connectionPool;
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
        org.junit.Assert.assertNull(responseCache12);
        org.junit.Assert.assertNull(connectionPool13);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy8();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient105();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient96();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient150();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient202();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy9();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient245();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient9();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient245();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient49();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient179();
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
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient34();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy4();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy9);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient39();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient141();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient260();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient24();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy10();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient233();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections6 = serializedObjectSupporter0.deserializeObjectList3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient222();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient110();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient27();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient21();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient164();
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
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient53();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        java.net.ProxySelector proxySelector9 = okHttpClient8.proxySelector;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxySelector9);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient34();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
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
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient96();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient141();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient48();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setFollowProtocolRedirects(false);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient36();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient107();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient2();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient246();
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
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient28();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient2();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setFollowProtocolRedirects(false);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
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
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient43();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
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
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient116();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient170();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
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
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient160();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient91();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient152();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient9();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient5.copyWithDefaults();
        com.squareup.okhttp.ConnectionPool connectionPool7 = okHttpClient5.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(connectionPool7);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient201();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient59();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient131();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient173();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setSSLSocketFactory(sSLSocketFactory15);
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
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy9();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = okHttpClient8.sslSocketFactory;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(sSLSocketFactory9);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient88();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient117();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient235();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient160();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient222();
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
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient44();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient213();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter4 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter4.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter4.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter4.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter4.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter4.deserializeObjectOkHttpClient182();
        java.net.Proxy proxy10 = serializedObjectSupporter4.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter4.deserializeObjectOkHttpClient108();
        okHttpClient3.serializedObjectSupporter = serializedObjectSupporter4;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter4.deserializeObjectOkHttpClient162();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter4.deserializeObjectOkHttpClient245();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient247();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections5 = serializedObjectSupporter0.deserializeObjectList1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient170();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient253();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient235();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient23();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter0.deserializeObjectOkHttpClient250();
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
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient27();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
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
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient88();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient126();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
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
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient9();
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        com.squareup.okhttp.ConnectionPool connectionPool8 = okHttpClient5.connectionPool;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(connectionPool8);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient13();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        java.net.Proxy proxy11 = serializedObjectSupporter0.deserializeObjectProxy7();
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
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient2();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient99();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient84();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient62();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient56();
        java.util.Set<com.squareup.okhttp.Route> routeSet10 = okHttpClient9.failedRoutes;
        java.net.ResponseCache responseCache11 = null;
        okHttpClient9.responseCache = responseCache11;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(routeSet10);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
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
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient43();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setSSLSocketFactory(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient39();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient242();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = okHttpClient6.getSslSocketFactory();
        java.net.ResponseCache responseCache8 = okHttpClient6.responseCache;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(sSLSocketFactory7);
        org.junit.Assert.assertNull(responseCache8);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient133();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient24();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter7 = okHttpClient6.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient207();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient242();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient112();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient226();
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
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient21();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient222();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient212();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient7();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient201();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
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
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient28();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient2();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient137();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient252();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient34();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
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
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient110();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient8.copyWithDefaults();
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
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient34();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient56();
        org.junit.Assert.assertNotNull(okHttpClient1);
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
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient206();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient34();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient192();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
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
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient166();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient170();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient112();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient68();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient226();
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
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient12();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient164();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient112();
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
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient206();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy7();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient250();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient152();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        java.net.ResponseCache responseCache10 = okHttpClient9.getResponseCache();
        java.net.CookieHandler cookieHandler11 = okHttpClient9.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient9.setHostnameVerifier(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(responseCache10);
        org.junit.Assert.assertNull(cookieHandler11);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient23();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient196();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
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
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient166();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient170();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient112();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient67();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient42();
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
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        java.net.Proxy proxy2 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient205();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(proxy2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient2();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient68();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient88();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
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
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = okHttpClient4.hostnameVerifier;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(hostnameVerifier5);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient166();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient170();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient250();
        java.net.ProxySelector proxySelector10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setProxySelector(proxySelector10);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient88();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient51();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient222();
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
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient88();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy9();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient112();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
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
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient18();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient97();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient147();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient42();
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
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient247();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient99();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient148();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient174();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
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
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient34();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient113();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
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
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient151();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient157();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient157();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient43();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient137();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient56();
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
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient98();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
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
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient196();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
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
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient44();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient258();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient260();
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
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient242();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient42();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections9 = serializedObjectSupporter0.deserializeObjectList3();
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
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient152();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient213();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
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
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        java.net.ResponseCache responseCache5 = okHttpClient4.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(responseCache5);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient156();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient196();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient250();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient99();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient68();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient150();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = okHttpClient8.sslSocketFactory;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(sSLSocketFactory9);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient205();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient26();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient140();
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
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient5.sslSocketFactory;
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient5.setCookieHandler(cookieHandler7);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient36();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient113();
        java.net.CookieHandler cookieHandler10 = okHttpClient9.cookieHandler;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(cookieHandler10);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient227();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient90();
        java.net.ResponseCache responseCache15 = okHttpClient14.responseCache;
        java.net.CookieHandler cookieHandler16 = null;
        okHttpClient14.cookieHandler = cookieHandler16;
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
        org.junit.Assert.assertNull(responseCache15);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient12();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient57();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient255();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
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
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient251();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = okHttpClient4.getSslSocketFactory();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = sSLSocketFactory5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(sSLSocketFactory5);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient48();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient52();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
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
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient127();
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
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient151();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient157();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient157();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient134();
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
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient164();
        java.net.ProxySelector proxySelector7 = okHttpClient6.proxySelector;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxySelector7);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient48();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient161();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient48();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient42();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient48();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient167();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient42();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        okHttpClient10.followProtocolRedirects = false;
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
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient209();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient249();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient9();
        java.net.ProxySelector proxySelector6 = okHttpClient5.proxySelector;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(proxySelector6);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient49();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections13 = serializedObjectSupporter0.deserializeObjectList1();
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
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient202();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy8();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient256();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient112();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient235();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        java.util.Set<com.squareup.okhttp.Route> routeSet10 = okHttpClient9.failedRoutes;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(routeSet10);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient88();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient202();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient202();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient210();
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
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient151();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient157();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient157();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient116();
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
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient88();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient220();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient170();
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
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient90();
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        okHttpClient5.connectionPool = connectionPool6;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter5 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter5.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter5.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter5.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter5.deserializeObjectOkHttpClient245();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter10 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter10.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter10.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter10.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter10.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter10.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter10.deserializeObjectOkHttpClient24();
        java.net.Proxy proxy17 = serializedObjectSupporter10.deserializeObjectProxy6();
        okHttpClient9.proxy = proxy17;
        okHttpClient4.proxy = proxy17;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(proxy17);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient18();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient97();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient147();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        java.net.Proxy proxy9 = okHttpClient8.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxy9);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient127();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
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
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient235();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient67();
        java.net.CookieHandler cookieHandler10 = null;
        okHttpClient9.cookieHandler = cookieHandler10;
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
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient209();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient57();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient242();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
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
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient2();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient178();
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
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient27();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient21();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient84();
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
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient227();
        com.squareup.okhttp.ConnectionPool connectionPool13 = okHttpClient12.getConnectionPool();
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
        org.junit.Assert.assertNull(connectionPool13);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
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
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient84();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
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
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient43();
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
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient256();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient170();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
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
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy9();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient27();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
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
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient251();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = okHttpClient4.getSslSocketFactory();
        java.net.CookieHandler cookieHandler6 = null;
        okHttpClient4.cookieHandler = cookieHandler6;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(sSLSocketFactory5);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        java.net.Proxy proxy2 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient158();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(proxy2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        java.util.Set<com.squareup.okhttp.Route> routeSet8 = okHttpClient7.getfailedRoutes();
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
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient18();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient97();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient226();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        java.net.Proxy proxy10 = serializedObjectSupporter0.deserializeObjectProxy10();
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
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient111();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient222();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient88();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient220();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient50();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient133();
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
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient34();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient132();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
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
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient220();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient96();
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
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient209();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient158();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient99();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient112();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient258();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        okHttpClient9.hostnameVerifier = hostnameVerifier10;
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
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient44();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient173();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient212();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
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
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient161();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient90();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient55();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient58();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
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
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient226();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient226();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient28();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient2();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient28();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient107();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient230();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient225();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
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
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient161();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
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
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient220();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
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
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient126();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
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
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient3();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient157();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
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
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient129();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient55();
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
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient59();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
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
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient146();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient251();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        java.net.ProxySelector proxySelector8 = okHttpClient7.proxySelector;
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
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient59();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient141();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient220();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient248();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient121();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient134();
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
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
        java.net.ProxySelector proxySelector10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setProxySelector(proxySelector10);
        java.net.CookieHandler cookieHandler12 = null;
        okHttpClient9.cookieHandler = cookieHandler12;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient178();
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
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient28();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
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
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient28();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient2();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient50();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter11 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter11.deserializeObjectOkHttpClient199();
        java.net.Proxy proxy13 = serializedObjectSupporter11.deserializeObjectProxy5();
        okHttpClient10.proxy = proxy13;
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
        org.junit.Assert.assertNotNull(proxy13);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient53();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = okHttpClient8.authenticator;
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = null;
        okHttpClient8.sslSocketFactory = sSLSocketFactory10;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(okAuthenticator9);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient110();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient71();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient164();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient96();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient256();
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
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient88();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient147();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient247();
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
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient205();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient250();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory9);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient36();
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
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient226();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient53();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient250();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        java.net.Proxy proxy10 = serializedObjectSupporter0.deserializeObjectProxy3();
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
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient151();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient157();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient134();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient98();
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
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient156();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient56();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient209();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
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
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient213();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient141();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections6 = serializedObjectSupporter0.deserializeObjectList3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
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
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient227();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient21();
        okHttpClient14.followProtocolRedirects = true;
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
}

